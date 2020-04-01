package com.hbsols.beans;

public class DTDC {
	public DTDC() {
		System.out.println("DTDC.DTDC():::: 0-Param constructor");
	}

	public String deliver(int oid) {
		return oid + "\t Order is delivered via DTDC ...!";
	}

}
