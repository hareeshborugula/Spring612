package com.hbsols.beans;

public class GooglePay implements Payment {

	public GooglePay() {
		System.out.println("GooglePay.GooglePay():::: 0-Param constructor");
	}

	@Override
	public String doPayment(int oid) {
		return oid + "\t for this order Payment made by Google Pay ...!";
	}

}
