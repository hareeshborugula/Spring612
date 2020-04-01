package com.hbsols.comp;

public class LuxuryCar extends Car {

	@Override
	public void assemble() {
		System.out.println("LuxuryCar.assemble() :::: Premium Equipment");
	}

	@Override
	public void painting() {
		System.out.println("LuxuryCar.painting()::: Imported Painting");
	}

	@Override
	public void roadTest() {
		System.out.println("LuxuryCar.roadTest() ::: More on Performance and Safety");
	}

}
