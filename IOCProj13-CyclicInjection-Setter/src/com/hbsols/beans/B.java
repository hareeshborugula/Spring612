package com.hbsols.beans;

public class B {

	private A a;

	public B() {
		System.out.println("B  0- Param Constructor");
	}
	

	public void setA(A a) {
		System.out.println(" from - B setter");
		this.a = a;
	}



	@Override
	public String toString() {
//		return "B [a=" + a + "]";
		return "B [a=  ]";
	}

}
