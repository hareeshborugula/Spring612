package com.hbsols.comp;

public class SportsCar extends Car {

	@Override
	public void assemble() {
		System.out.println("SportsCar.assemble()::::Premium Equipment and Sports Look");
	}

	@Override
	public void painting() {
		System.out.println("SportsCar.painting() :::: Imported Paints with Vibrant Look");
	}

	@Override
	public void roadTest() {
		System.out.println("SportsCar.roadTest():::: More on Performance and Safety and SPEED");
	}

}
