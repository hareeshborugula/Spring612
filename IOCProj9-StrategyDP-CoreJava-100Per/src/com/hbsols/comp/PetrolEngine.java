package com.hbsols.comp;

public class PetrolEngine implements Engine {

	public PetrolEngine() {
		System.out.println("PetrolEngine.PetrolEngine()  0 - param cons");
	}

	@Override
	public void start() {
		System.out.println("PetrolEngine.started");
	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stoped ");
	}

}
