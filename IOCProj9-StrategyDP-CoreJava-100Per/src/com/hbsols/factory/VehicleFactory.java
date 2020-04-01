package com.hbsols.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.hbsols.comp.Engine;
import com.hbsols.comp.Vehicle;

public class VehicleFactory {

	private static Properties props;

	static {
		InputStream inStream = null;
		try {
			// Locate properties file
			inStream = new FileInputStream("src/com/hbsols/commons/App.properties");
			props = new Properties();
			// Load propeties file into java.util.Properties collection
			props.load(inStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// static

	public static Vehicle getInstance() {
		Vehicle vehicle = null;
		Engine engine = null;
		try {
			// Load and create Target class object
			vehicle = (Vehicle) Class.forName(props.getProperty("target.class")).newInstance();
			// Load and create Dependent class object
			engine = (Engine) Class.forName(props.getProperty("dependent.class")).newInstance();

			vehicle.setEngine(engine);
		} catch (InstantiationException ie) {
			ie.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vehicle;
	}// get Instance
}
