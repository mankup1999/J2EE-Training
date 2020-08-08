package com.bean;

public class AuctionBean {

	private int itemId;
	private String itemName;
	private String yourName;
	private String emailId;
	private double amountBid;
	private boolean autoInc;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getAmountBid() {
		return amountBid;
	}

	public void setAmountBid(double amountBid) {
		this.amountBid = amountBid;
	}

	public boolean isAutoInc() {
		return autoInc;
	}

	public void setAutoInc(boolean autoInc) {
		this.autoInc = autoInc;
	}

	public boolean getAutoInc() {
		return autoInc;
	}

}
