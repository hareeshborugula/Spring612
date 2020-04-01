package com.hbsols.test;

import com.hbsols.comp.Vehicle;
import com.hbsols.factory.VehicleFactory;

public class StrategyDPTest {
	public static void main(String[] args) {

		Vehicle vehicle = null;

		vehicle = VehicleFactory.getInstance();
		vehicle.journey("Hyderabad", "Bangalore");
	}
}
