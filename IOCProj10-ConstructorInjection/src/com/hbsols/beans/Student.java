package com.hbsols.beans;

public class Student {

	private int sno;
	private float avg;
	private String sname;

	public Student(int sno, String sname) {
		System.out.println("Student :: 2-Param Constructor");
		this.sno = sno;
		this.sname = sname;
	}

	public Student(int sno, String sname, float avg) {
		System.out.println("Student  :: 3-Param Constructor");
		this.sno = sno;
		this.sname = sname;
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", avg=" + avg + "]";
	}

}
