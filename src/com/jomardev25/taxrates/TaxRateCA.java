package com.jomardev25.taxrates;

import com.jomardev25.Tax;
import com.jomardev25.TaxCalculator;

public class TaxRateCA implements Tax {

	private final double taxRate = 6.5;
	private final TaxCalculator taxCalculator;

	public TaxRateCA(TaxCalculator taxCalculator) {
		this.taxCalculator = taxCalculator;
	}

	@Override
	public double calculateTaxSales(double amount) {
		return taxCalculator.calculateTaxSales(taxRate, amount);
	}

}
