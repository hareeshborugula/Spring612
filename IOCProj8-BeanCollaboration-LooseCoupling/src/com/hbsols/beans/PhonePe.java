package com.hbsols.beans;

public abstract class PhonePe implements Payment{

	public PhonePe() {
		System.out.println("PhonePe.PhonePe() :::: 0-Param constructor");
	}

	@Override
	public String doPayment(int oid) {
		return oid + "\t for this order Payment made by Phone Pay ...!";
	}

}
