package com.hbsols.test;

import java.lang.reflect.Constructor;

import com.hbsols.comp.Test;

public class InstantiationTest {
	public static void main(String[] args) {

		Class cls = null;
		Constructor[] cons = null;
		Test t1 = null, t2 = null;

		try {

			// Load Class
			cls = Class.forName("com.hbsols.comp.Test");

			// get access to constructors
			cons = cls.getDeclaredConstructors();
			
			// get access to private constructors
			cons[0].setAccessible(true);
			cons[1].setAccessible(true);
			
			// Instantiate the Classes
			t1 = (Test) cons[0].newInstance();
			System.out.println(t1);

			t2 = (Test) cons[1].newInstance(10, 20);
			System.out.println(t2);
			
		} catch (InstantiationException iae) {
			iae.printStackTrace();
		} catch (IllegalAccessException ie) {
			ie.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
