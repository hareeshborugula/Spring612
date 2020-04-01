package com.hbsols.beans;

// E:\instl_soft\spring-framework-5.2.3.RELEASE\docs\spring-framework-reference

// file:///E:/instl_soft/spring-framework-5.2.3.RELEASE/docs/spring-framework-reference/core.html#beans-factory-metadata

import java.util.Date;

public class WishMsgGenerator {

	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}

	public String generateWishMsg(String user) {
		int hrs = 0;

		hrs = date.getHours();

		if (hrs < 12)
			return "Good Morning :::" + user;
		else if (hrs < 18)
			return "Good Afternoon::::" + user;
		else if (hrs < 20)
			return "Good Evening :::::" + user;
		else
			return "Good Night::::" + user;
	}

}
