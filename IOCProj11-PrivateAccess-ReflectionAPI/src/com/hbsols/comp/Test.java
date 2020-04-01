package com.hbsols.comp;

public class Test {

	private int a, b;

	private Test() {
		System.out.println("Test 0-Param constructor");
	}

	private Test(int a, int b) {
		System.out.println("Test 2-Param constructor");
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}

}
