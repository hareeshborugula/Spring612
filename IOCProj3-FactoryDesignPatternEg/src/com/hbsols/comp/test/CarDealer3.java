package com.hbsols.comp.test;

import com.hbsols.comp.Car;
import com.hbsols.comp.SportsCar;

public class CarDealer3 {
	public static void main(String[] args) {
		Car car3 = null;

		car3 = new SportsCar();

		car3.assemble();
		car3.painting();
		car3.roadTest();
	}
}
