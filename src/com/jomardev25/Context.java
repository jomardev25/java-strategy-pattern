package com.jomardev25;

public class Context {

	private final Tax tax;

	public Context(Tax taxCalculator) {
		this.tax = taxCalculator;
	}

	public double calculateTaxSales(double amount) {
		return tax.calculateTaxSales(amount);
	}

}
