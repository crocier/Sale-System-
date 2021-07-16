package com.javaprogramming;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		SaleItem item1 = new SaleItem("Monitor",7000); // desc and rate

		SaleItem item2 = new SaleItem("Hard disk",5500);

		Sale sale1 = new Sale(item1,2,5); // item, qty and discount

		Sale sale2 = new Sale(item2,5,10);

		SaleList list = new SaleList("18-08-2005","Jennifer");

		list.add(sale1);

		list.add(sale2);

		BillingSys sys = new BillingSys();

		sys.generateBill(list);
	}
}
