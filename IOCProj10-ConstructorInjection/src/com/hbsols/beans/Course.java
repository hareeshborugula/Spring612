package com.hbsols.beans;

public class Course {
	private int cid;
	private String cname;
	private String facultyName;
	private float fee;

	public Course(int cid, String cname, String facultyName, float fee) {
		
		System.out.println("Course.:: 4-Param Constructor");
		
		this.cid = cid;
		this.cname = cname;
		this.facultyName = facultyName;
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", facultyName=" + facultyName + ", fee=" + fee + "]";
	}

}
