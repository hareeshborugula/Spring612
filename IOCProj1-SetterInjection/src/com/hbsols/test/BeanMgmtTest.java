package com.hbsols.test;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.hbsols.beans.WishMsgGenerator;

public class BeanMgmtTest {
	public static void main(String[] args) {
		System.out.println("stat of main(-) method");
		Resource res=null;
		BeanFactory factory=null;
		Date d=null;
		WishMsgGenerator generator=null;
		
		res=new FileSystemResource("src/com/hbsols/cfgs/applicationContext.xml");
		factory=new XmlBeanFactory(res);
		generator=(WishMsgGenerator)factory.getBean("wishMsg");
		  factory.getBean("wishMsg");
		  factory.getBean("wishMsg");
		  factory.getBean("wishMsg");
		System.out.println("Wish message::"+generator.generateWishMsg("Saraswathi B"));
		
		System.out.println("end of main(-) method");
	}//main

}
