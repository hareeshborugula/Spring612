package com.hbsols.factory.test;

import com.hbsols.comp.Car;
import com.hbsols.factory.CarFactory;

public class CarDealer2 {
public static void main(String[] args) {

	Car car2 = CarFactory.getInstance("luxury");
}
}
