package com.hbsols.comp;

public class Vehicle {

	private Engine engine;

	public Vehicle() {
		System.out.println("Vehicle.Vehicle() 0-param const");
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void journey(String source, String dest) {
		engine.start();

		System.out.println("Journey started ::: from :::" + source);
		System.out.println();
		System.out.println("Journey is going on .... ");
		System.out.println();
		System.out.println("Journey ended at :::" + dest);
		engine.stop();
	}

}
