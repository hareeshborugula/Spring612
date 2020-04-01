package com.hbsols.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.hbsols.bo.StudentBO;
import com.hbsols.controller.MainController;
import com.hbsols.vo.StudentVO;

public class RealTimeDITest {
	public static void main(String[] args) {

		BeanFactory factory = null;
		Scanner sc = null;
		StudentVO vo = null;
		StudentBO bo = null;
		MainController controller =  null;
		int sno = 0, m1= 0, m2 = 0, m3 = 0;
		String sname = null, saddr = null, result = null;
		
		// Read inputs  sno, sname, saddr, m1, m2, m3 from enduser
		
		sc = new Scanner(System.in);
		System.out.println("Enter Student Number::");
		sno = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Student Name ::");
		sname = sc.nextLine();
		System.out.println("Enter Student Address");
		saddr = sc.nextLine();
		System.out.println("Enter Student M1 marks");
		m1 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Student M2 marks");
		m2 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Student M3 marks");
		m3 = Integer.parseInt(sc.nextLine());
		
		// Create StudentVO class Object
		vo = new StudentVO();
		
		vo.setSno(sno);
		vo.setSname(sname);
		vo.setSaddr(saddr);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		
		// Create IOC container
		factory = new XmlBeanFactory(new ClassPathResource("com/hbsols/cfgs/applicationContext.xml"));
		
		// get controller class obj from IOC container
		controller = factory.getBean("controller",MainController.class);
		
		//Invoke method
		
		try {
				result = controller.handle(vo);
				System.out.println(result);
		} catch (Exception e) {
			if( ((SQLException)e) .getErrorCode() == 1)
				System.out.println("Student Already register!");
			if( ((SQLException)e) .getErrorCode() == 12899)
				System.out.println("Student Info is Larger than given col size");
			if( ((SQLException)e) .getErrorCode() == 947)
				System.out.println("Student Info insufficient to insert");
			else
				System.out.println("Unknown Internal Problem");
		}
		
 	}
}
