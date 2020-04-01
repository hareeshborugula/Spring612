package com.hbsols.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.hbsols.beans.WishMsgGenerator;

public class SetterInjectionTest {
	
public static void main(String[] args) {
	
	Resource res = null ;
	BeanFactory factory = null;
	WishMsgGenerator generator = null;
	Object obj = null;
	
	res = new FileSystemResource("src/com/hbsols/cfgs/applicationContext.xml");
	factory = new XmlBeanFactory(res);
	
	obj = factory.getBean("wishMsg");
	generator = (WishMsgGenerator) obj ;
	
	System.out.println("Output :::"+generator.generateWishMsg("Hareesh Borugolla"));
}
}
