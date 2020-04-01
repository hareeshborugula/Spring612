package com.hbsols.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.hbsols.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {

	private static final String INSERT_STUDENT_QUERY = "INSERT INTO LAYERED_STUDENT VALUES(?,?,?,?,?,?)";  // STD_SEQ.NEXTVAL,

	private DataSource dataSource;

	public StudentDAOImpl(DataSource dataSource) {
		System.out.println("StudentDAOImpl :: 1-Param Constructor" + dataSource.getClass());
		this.dataSource = dataSource;
	}

	@Override
	public int insert(StudentBO bo) throws Exception {

		Connection con = null;
		PreparedStatement ps = null;
		int count = 0;

		// Write JDBC code and get Pooled JDBC con object

		con = dataSource.getConnection();

		// Create PreparedStatement obj

		ps = con.prepareStatement(INSERT_STUDENT_QUERY);

		// set query params

		ps.setLong(1, bo.getSno());
		ps.setString(2, bo.getSname());
		ps.setString(3, bo.getSaddr());
		ps.setLong(4, bo.getTotal());
		ps.setFloat(5, bo.getAvg());
		ps.setString(6, bo.getResult());
		
		count = ps.executeUpdate();

		// cloase jdbc objs
		ps.close();
		con.close();

		return count;
	}

}
