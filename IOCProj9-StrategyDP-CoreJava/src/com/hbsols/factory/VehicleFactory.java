package com.hbsols.factory;

import com.hbsols.comp.DieselEngine;
import com.hbsols.comp.Engine;
import com.hbsols.comp.PetrolEngine;
import com.hbsols.comp.Vehicle;

public class VehicleFactory {

	public static Vehicle getInstance(String type) {

		Vehicle vehicle = null;
		Engine engine = null;

		if (type.equalsIgnoreCase("petrol"))
			engine = new PetrolEngine();
		else if (type.equalsIgnoreCase("diesel"))
			engine = new DieselEngine();
		else
			throw new IllegalArgumentException("Invalid Engine type...!");

		vehicle = new Vehicle();
		vehicle.setEngine(engine);
		
		return vehicle;
	}
}
