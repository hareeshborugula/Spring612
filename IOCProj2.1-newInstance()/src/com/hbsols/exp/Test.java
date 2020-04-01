package com.hbsols.exp;

public class Test {

	int x, y;

	public Test() {
		System.out.println("Test.Test() - 0-param constructor");
	}

	public Test(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + "]";
	}

}
