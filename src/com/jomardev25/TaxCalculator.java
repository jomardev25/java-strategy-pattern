package com.jomardev25;

public class TaxCalculator {

	public double calculateTaxSales(double taxRate, double amount) {
		return (taxRate / 100) * amount;
	}

}
