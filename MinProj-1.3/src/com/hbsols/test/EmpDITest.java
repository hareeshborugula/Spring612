package com.hbsols.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.hbsols.controller.MainController;
import com.hbsols.vo.EmployeeVO;

public class EmpDITest {
	public static void main(String[] args) {

		Scanner sc = null;
		BeanFactory factory = null;
		MainController controller = null;
		int eno;
		String ename = null, eaddr = null, result = null;
		float basicSal = 0.0f;
		EmployeeVO vo = null;

		sc = new Scanner(System.in);
		System.out.println("Enter Employee Name");
		ename = sc.nextLine();
		System.out.println("Enter Employee Address");
		eaddr = sc.nextLine();
		System.out.println("Enter Employee Basic Sal");
		basicSal = Float.parseFloat(sc.nextLine());
		vo = new EmployeeVO();

		vo.setEname(ename);
		vo.setEaddr(eaddr);
		vo.setBasicSal(basicSal);

		factory = new XmlBeanFactory(new ClassPathResource("com/hbsols/cfgs/applicationContext.xml"));
		controller = factory.getBean("empController", MainController.class);

		try {
			result = controller.process(vo);
			System.out.println(result);
		} // try
		catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Employee Reg Failed !");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Employee Reg Failed");
		}
	}
}
