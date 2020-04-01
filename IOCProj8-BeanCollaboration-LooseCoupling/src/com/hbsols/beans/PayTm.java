package com.hbsols.beans;

public class PayTm implements Payment {

	public PayTm() {
		System.out.println("PayTm.PayTm()");
	}
	@Override
	public String doPayment(int oid) {
		return oid + "\t for this order Payment made by  PayTm ...!";
	}

}
