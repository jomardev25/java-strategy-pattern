package com.jomardev25.taxrates;

import com.jomardev25.Tax;
import com.jomardev25.TaxCalculator;

public class TaxRateTX implements Tax {

	private final double taxRate = 6.25;
	private final TaxCalculator taxCalculator;

	public TaxRateTX(TaxCalculator taxCalculator) {
		this.taxCalculator = taxCalculator;
	}

	@Override
	public double calculateTaxSales(double amount) {
		return taxCalculator.calculateTaxSales(taxRate, amount);
	}

}
