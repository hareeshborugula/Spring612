package com.hbsols.beans;

public class BlueDart {

	public BlueDart() {
		System.out.println("BlueDart.BlueDart() :::: 0-Param constructor");
	}

	public String deliver(int oid) {
		return oid + "\t Order is delivered via BlueDart ...!";
	}

}
