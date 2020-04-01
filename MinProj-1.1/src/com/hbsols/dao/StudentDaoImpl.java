package com.hbsols.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.hbsols.bo.StudentBO;

public class StudentDaoImpl implements IStudentDao {

	private static final String QUERY = "INSERT INTO STUDENT VALUES(STD_SEQ.NEXTVAL,?,?,?,?,?)";

	private DataSource ds;

	public StudentDaoImpl(DataSource ds) {
		System.out.println("StudentDaoImpl 0-Param Constructor");
		this.ds = ds;
	}

	@Override
	public int insert(StudentBO bo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int count;

		con = ds.getConnection();
		ps = con.prepareStatement(QUERY);

		ps.setString(1, bo.getSname());
		ps.setString(2, bo.getAddr());
		ps.setInt(3, bo.getTot());
		ps.setFloat(4, bo.getAvg());
		ps.setString(5, bo.getResult());

		count = ps.executeUpdate();

		// close the jdbc objs
		ps.close();
		con.close();

		return count;
	}
}
