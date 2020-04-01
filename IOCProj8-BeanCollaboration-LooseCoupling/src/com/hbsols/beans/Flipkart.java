package com.hbsols.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	private Payment payment;

	public Flipkart() {
		System.out.println("Flipkart.Flipkart():::: 0-param constructor");
	}

	public Flipkart(Payment payment) {
System.out.println("Flipkart.Flipkart() :: Flipakart 1-param const");
		this.payment = payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
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

		status =	payment.doPayment(orderId);

		return Arrays.toString(items) + "\t with Prices :::\t" + Arrays.toString(price) + "\t having Bill Amount ::: \t"
				+ billAmt + "\t   status ::::" + status;
	}
}
