package com.hbsols.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	private DTDC dtdc;

	public Flipkart() {
		System.out.println("Flipkart.Flipkart():::: 0-param constructor");
	}

	public void setDtdc(DTDC dtdc) {
		System.out.println("Flipkart.setDtdc() :: setter method from Flipkart ...");
		this.dtdc = dtdc;
	}

	public String shopping(String items[], float price[]) {
		Random random = null;
		int orderId = 0;
		float billAmt = 0.0f;
		String status = null;

		random = new Random();
		orderId = random.nextInt(100000);

		for (float f : price) {
			billAmt = billAmt + f;
		}

		status = dtdc.deliver(orderId);

		return Arrays.toString(items) + "\t with Prices :::\t" + Arrays.toString(price) + "\t having Bill Amount ::: \t"
				+ billAmt + "\t  Delivery status ::::" + status;
	}
}
