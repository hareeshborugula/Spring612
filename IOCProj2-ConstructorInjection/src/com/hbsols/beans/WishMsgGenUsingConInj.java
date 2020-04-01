package com.hbsols.beans;

import java.util.Date;

public class WishMsgGenUsingConInj {

	private java.util.Date date;

	public WishMsgGenUsingConInj(Date date) {
		this.date = date;
	}

	public String getWishMsg(String user) {
		
		int hr =0;
		
		hr = date.getHours();
		
		if(hr<12)
			return "Good Morning:::"+user;
		else if(hr<16)
			return "Good Afternoon:::"+user;
		else if(hr<18)
			return "Good Evening :::"+user;
		else
			return "Good Night :::"+user;
	}
}
