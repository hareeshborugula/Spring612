package com.hbsols.beans;

public class DTDC implements Courier {
	public DTDC() {
		System.out.println("DTDC.DTDC():::: 0-Param constructor");
	}

	@Override
	public String deliver(int oid) {
		return oid + "\t Order is delivered via DTDC ...!";
	}

}
