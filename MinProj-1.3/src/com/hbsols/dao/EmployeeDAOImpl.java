package com.hbsols.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.hbsols.bo.EmployeeBO;

public class EmployeeDAOImpl implements IEmployeeDAO {

	private static final String QUERY = "INSERT INTO EMP_TAB VALUES(EMP_SEQ.NEXTVAL,?,?,?,?,?)";
	private DataSource ds;

	public EmployeeDAOImpl(DataSource ds) {
		System.out.println("EmployeeDAOImpl - 1-Param Constructor");
		this.ds = ds;
	}

	@Override
	public int insert(EmployeeBO bo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int count;

		con = ds.getConnection();
		ps = con.prepareStatement(QUERY);


		ps.setString(1, bo.getEname());
		ps.setString(2, bo.getEaddr());
		ps.setFloat(3, bo.getBasicSal());
		ps.setFloat(4, bo.getGross());
		ps.setFloat(5, bo.getNetpay());

		count = ps.executeUpdate();

		ps.close();
		con.close();

		return count;
	}

}
