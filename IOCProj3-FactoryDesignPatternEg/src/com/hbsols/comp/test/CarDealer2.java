package com.hbsols.comp.test;

import com.hbsols.comp.Car;
import com.hbsols.comp.LuxuryCar;

public class CarDealer2 {
	public static void main(String[] args) {

		Car car2 = null;

		car2 = new LuxuryCar();

		car2.assemble();
		car2.painting();
		car2.roadTest();
	}
}
