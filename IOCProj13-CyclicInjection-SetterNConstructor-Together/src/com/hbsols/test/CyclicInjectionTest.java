package com.hbsols.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.hbsols.beans.A;
import com.hbsols.beans.B;

public class CyclicInjectionTest {
	public static void main(String[] args) {

		BeanFactory factory = null;
		A a = null;
		B b = null;
		// create IOC container

		factory = new XmlBeanFactory(new ClassPathResource("com/hbsols/cfgs/applicationContext.xml"));

		// get A class obj
		a = (A) factory.getBean("a1", A.class);
		System.out.println(a);

		System.out.println(":::::::::::::::::::::::::::::");

		b = (B) factory.getBean("b1", B.class);
		System.out.println(b);

	}
}
