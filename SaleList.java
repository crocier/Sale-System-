package com.javaprogramming;

import java.util.ArrayList;
import java.util.List;

public class SaleList {
	
	private String dtSale;
	private String cusName;
	
	List<Sale> sales = new ArrayList<Sale>();
	

	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}


	public SaleList() {
		super();
	}

	
	public SaleList(String string, String cusName) {
		super();
		this.dtSale = string;
		this.cusName = cusName;
	}


	
	public String getDtSale() {
		return dtSale;
	}

	public void setDtSale(String dtSale) {
		this.dtSale = dtSale;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public List<Sale> getSales() {
		return sales;
	}

	public void setSales(ArrayList<Sale> sales) {
		this.sales = sales;
	}


	public void add(Sale sale1) {
		this.sales.add(sale1);
		
	}
	

	
	
	

}
