package com.hbsols.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{

//	private int eno;
	private String ename;
	private String eaddr;
	private float basicSal;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEaddr() {
		return eaddr;
	}

	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}

	public float getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(float basicSal) {
		this.basicSal = basicSal;
	}

}
