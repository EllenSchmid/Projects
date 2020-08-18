package com.techelevator;

import java.util.Scanner;

public class CurrencyCLI {

	public CurrencyCLI() {

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"To convert from US dollars to Euros please select 1 to convert from Euros to US dollars please select 2");
		String countryToConvert = (scanner.nextLine());

		System.out.println("Please enter the amount (greater than zero) that you would like to convert");
		double convertAmount = Double.parseDouble(scanner.nextLine());
		convertCurrency(countryToConvert, convertAmount);
	}

	public static void convertCurrency(String countryToConvert, double convertAmount) {
		double conversionRate = 1.18;
//		String euro = "\u20ac";

		if (countryToConvert.equals("1")) {
			System.out.printf("$%.2f", convertAmount / conversionRate);
		} else if (countryToConvert.equals("2")) {
			System.out.printf("%.2f \u20ac", convertAmount * conversionRate);
		}

	}

}
