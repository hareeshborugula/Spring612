package com.hbsols.beans;

public class A {

	private B b;

	public A() {
		System.out.println("A.0-Param Constructor");
	}

	public void setB(B b) {
		System.out.println(" from A :: setterr ");
		this.b = b;
	}

	@Override
	public String toString() {
//		return "A [b=" + b + "]";
		return "A [b= ]";
	}

}
