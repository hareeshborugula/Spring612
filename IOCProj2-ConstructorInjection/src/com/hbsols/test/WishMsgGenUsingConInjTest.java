package com.hbsols.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.hbsols.beans.WishMsgGenUsingConInj;

public class WishMsgGenUsingConInjTest {
public static void main(String[] args) {
	
	Resource res = null;
	Object obj = null;
	BeanFactory factory = null;
	WishMsgGenUsingConInj wishMsg = null;
	
	try {
			res = new ClassPathResource("com/hbsols/cfgs/applicationContext.xml");
			factory = new XmlBeanFactory(res);
			wishMsg = (WishMsgGenUsingConInj) factory.getBean("wishMsgGen");
			System.out.println(wishMsg.getWishMsg("Hareesh Borugula"));
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
