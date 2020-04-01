package com.hbsols.factory.test;

import com.hbsols.comp.Car;
import com.hbsols.factory.CarFactory;

public class CarDealer1 {
public static void main(String[] args) {

	Car car1 = CarFactory.getInstance("standard");
}
}
