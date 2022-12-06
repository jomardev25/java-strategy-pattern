package com.jomardev25.taxrates;

import com.jomardev25.Tax;
import com.jomardev25.TaxCalculator;

public class TaxRateNY implements Tax {

	private final double taxRate = 4;
	private final TaxCalculator taxCalculator;

	public TaxRateNY(TaxCalculator taxCalculator) {
		this.taxCalculator = taxCalculator;
	}

	@Override
	public double calculateTaxSales(double amount) {
		return taxCalculator.calculateTaxSales(taxRate, amount);
	}

}
