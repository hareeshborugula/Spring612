package com.hbsols.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.hbsols.beans.Flipkart;

public class BeanCollaborationTest {
public static void main(String[] args) {
	
	Resource res = null;
	BeanFactory factory = null;
	Flipkart flipKart = null;
	
	res = new ClassPathResource("com/hbsols/cfgs/applicationContext.xml");
	factory = new XmlBeanFactory(res);
	
	flipKart = (Flipkart) factory.getBean("flipkart", Flipkart.class);
	
	System.out.println(flipKart.shopping(new String[] {"color","color gun","Bhang","sweets"}, new float[] {500.00f,5632.02f,8002.36f,1021.25f}));
}
}
