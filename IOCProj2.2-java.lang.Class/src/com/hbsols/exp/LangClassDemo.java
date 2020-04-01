package com.hbsols.exp;

public class LangClassDemo {
	public static void main(String[] args) throws Exception {

		Class c1 = Class.forName("java.util.Date");
		System.out.println("c1 class name::" + c1.getClass() + " cl data::" + c1.toString());

		System.out.println("....................");
		String s = new String("ok");

		Class c2 = s.getClass();
		System.out.println("c2 class name::" + c2.getClass() + " c2 data::" + c2.toString());
		System.out.println("....................");

		Class c3 = java.util.Date.class;
		System.out.println("c3 class name::" + c3.getClass() + " c3 data::" + c3.toString());
		System.out.println("....................");

		Class c4 = LangClassDemo.class;
		System.out.println("c4 class name::" + c4.getClass() + " c4 data::" + c4.toString());

	}
}
