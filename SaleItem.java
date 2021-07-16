package com.javaprogramming;

public class SaleItem {
	
	private int rate;
	private String des;
	
	public SaleItem() {
		super();
	}

	public SaleItem(String des, int rate) {
		super();
		this.rate = rate;
		this.des = des;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
	
	

}
