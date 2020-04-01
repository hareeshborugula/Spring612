package com.hbsols.comp;

public class StandardCar extends Car {

	@Override
	public void assemble() {
		System.out.println("StandardCar.assemble() ::: Economy Equipment ");
	}

	@Override
	public void painting() {
		System.out.println("StandardCar.painting() :::: Asian Painting");
	}

	@Override
	public void roadTest() {
		System.out.println("StandardCar.roadTest() :::: More on Perfomance and Less on Safety ");
	}

}
