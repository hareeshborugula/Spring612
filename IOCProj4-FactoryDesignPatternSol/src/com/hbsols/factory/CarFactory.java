package com.hbsols.factory;

import com.hbsols.comp.Car;
import com.hbsols.comp.LuxuryCar;
import com.hbsols.comp.SportsCar;
import com.hbsols.comp.StandardCar;

public class CarFactory {

	public static Car getInstance(String type) {

		Car car = null;

		if (type.equalsIgnoreCase("standard"))

			car = new StandardCar();

		else if (type.equalsIgnoreCase("luxury"))

			car = new LuxuryCar();

		else if (type.equalsIgnoreCase("sports"))

			car = new SportsCar();

		else

			throw new IllegalArgumentException("Invalid Car Type :::");

		car.assemble();
		car.painting();
		car.roadTest();

		return car;

	}
}
