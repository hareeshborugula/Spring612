package com.hbsols.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.hbsols.beans.Course;
import com.hbsols.beans.Marks;
import com.hbsols.beans.Student;

public class ConstructorInjectionTest {
	public static void main(String[] args) {

		BeanFactory factory = null;
		Student student = null;
		Marks marks = null;
		Course course = null;

		// Create IOC container
		factory = new XmlBeanFactory(new ClassPathResource("com/hbsols/cfgs/applicationContext.xml"));
		// get Spring Bean class object
		student = factory.getBean("studentInfo", Student.class);
		System.out.println(student);
		System.out.println("::::::::::::::::::::::::::::::::::::::::::");
		
		marks = factory.getBean("marksInfo", Marks.class);
		System.out.println(marks);
		
		System.out.println("==================================");
		
		course = factory.getBean("courseInfo", Course.class);
		System.out.println(course);
	}
}
