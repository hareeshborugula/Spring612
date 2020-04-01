package com.hbsols.beans;

public class B {

	private A a;

	public B() {
		System.out.println("B  0- Param Constructor");
	}

	public B(A a) {
		System.out.println("B 1-Param Constructor");
		this.a = a;
	}



	/*
	 * public void setA(A a) { System.out.println(" from - B setter"); this.a = a; }
	 */


	@Override
	public String toString() {
//		return "B [a=" + a + "]";
		return "B [a=  ]";
	}

}
