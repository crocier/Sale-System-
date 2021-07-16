package com.javaprogramming;

public class Sale {
	 
	private int qty;
	private double disc;
	
	//sale has a saleitem
	private SaleItem saleitem;
	
	
	public SaleItem getSaleitem() {
		return saleitem;
	}


	public void setSaleitem(SaleItem saleitem) {
		this.saleitem = saleitem;
	}


	public Sale(SaleItem saleitem, double disc, int qty) {
		super();
		this.qty = qty;
		this.disc = disc;
		this.saleitem = saleitem;
	}

	public Sale() {
		super();
	}


	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getDisc() {
		return disc;
	}

	public void setDisc(double disc) {
		this.disc = disc;
	}


	
	

}
