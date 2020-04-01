package com.hbsols.comp;

public class DieselEngine implements Engine {

	public DieselEngine() {
		System.out.println("DieselEngine.DieselEngine() 0-param const");
	}

	@Override
	public void start() {
		System.out.println("DieselEngine.started ...");
	}

	@Override
	public void stop() {
		System.out.println("DieselEngine.stoped ");
	}

}
