package com.hbsols.comp.test;

import com.hbsols.comp.Car;
import com.hbsols.comp.StandardCar;

public class CarDealer1 {
	public static void main(String[] args) {

		Car car1 = null;

		car1 = new StandardCar();

		car1.assemble();
		car1.painting();
		car1.roadTest();
	}
}
