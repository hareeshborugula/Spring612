package com.hbsols.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.hbsols.beans.Vehicle;

public class StrategyDPTest {
	public static void main(String[] args) {
		BeanFactory factory = null;
		Vehicle vehicle = null;
		Resource resource = null;
		
		resource = new ClassPathResource("com/hbsols/cfg/applicationContext.xml");
		factory = new XmlBeanFactory(resource);
		vehicle = (Vehicle) factory.getBean("vehicle");
		vehicle.journey("Hyderabad", "Delhi");
	}
}
