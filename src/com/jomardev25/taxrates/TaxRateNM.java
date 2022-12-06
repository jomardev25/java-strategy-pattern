package com.jomardev25.taxrates;

import com.jomardev25.Tax;
import com.jomardev25.TaxCalculator;

public class TaxRateNM implements Tax {

	private final double taxRate = 5.125;
	private final TaxCalculator taxCalculator;

	public TaxRateNM(TaxCalculator taxCalculator) {
		this.taxCalculator = taxCalculator;
	}

	@Override
	public double calculateTaxSales(double amount) {
		return taxCalculator.calculateTaxSales(taxRate, amount);
	}
}
