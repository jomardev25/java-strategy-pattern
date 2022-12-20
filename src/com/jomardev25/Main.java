package com.jomardev25;

import java.util.Scanner;

import com.jomardev25.taxrates.TaxRateCA;
import com.jomardev25.taxrates.TaxRateMN;
import com.jomardev25.taxrates.TaxRateNM;
import com.jomardev25.taxrates.TaxRateNY;
import com.jomardev25.taxrates.TaxRateTX;

public class Main {

	static public void main(String[] args) throws Exception {
		System.out.print("Enter the state(MN, CA, NY, NM, TX): ");
		Scanner stateScanner = new Scanner(System.in);

		try {
			States state = States.valueOf(stateScanner.nextLine());
			System.out.print("Enter the amount: ");
			Scanner amountScanner = new Scanner(System.in);
			double amount = amountScanner.nextDouble();
			Context context = null;
			TaxCalculator taxCalculator = new TaxCalculator();

			switch (state) {
				case MN:
					context = new Context(new TaxRateMN(taxCalculator));
					printResults(amount, context.calculateTaxSales(amount), state.toString());
					break;
				case CA:
					context = new Context(new TaxRateCA(taxCalculator));
					printResults(amount, context.calculateTaxSales(amount), state.toString());
					break;
				case NY:
					context = new Context(new TaxRateNY(taxCalculator));
					printResults(amount, context.calculateTaxSales(amount), state.toString());
					break;
				case NM:
					context = new Context(new TaxRateNM(taxCalculator));
					printResults(amount, context.calculateTaxSales(amount), state.toString());
					break;
				case TX:
					context = new Context(new TaxRateTX(taxCalculator));
					printResults(amount, context.calculateTaxSales(amount), state.toString());
					break;
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid inputted state");
		}
	}

	private static void printResults(double amount, double taxRate, String state) {
		System.out.println();
		System.out.println(String.format("Amount: %.2f", amount));
		System.out.println(String.format("Tax Sales: %.2f", taxRate));
		System.out.println("State: " + state);
	}

}
