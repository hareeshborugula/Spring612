package com.hbsols.beans;

public class BlueDart implements Courier{

	public BlueDart() {
		System.out.println("BlueDart.BlueDart() :::: 0-Param constructor");
	}

	@Override
	public String deliver(int oid) {
		return oid + "\t Order is delivered via BlueDart ...!";
	}

}
