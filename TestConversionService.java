package com.oca.testing;

import com.oca.utils.ConversionService;

public class TestConversionService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ConversionService.fluidOunces(1.1f));
		System.out.println(ConversionService.gallons(2.2f));
		System.out.println(ConversionService.grams(30));
		System.out.println(ConversionService.milliliters(40));
		System.out.println(ConversionService.ounces(50));
		System.out.println(ConversionService.pints(6.6f));
		System.out.println(ConversionService.pounds(7.7));

	
		ConversionService.fluidOunces((float)1.1);
		ConversionService.grams((int)30);
		ConversionService.milliliters((short)4.0);
		int grams = ConversionService.grams(30);
		int byteGrams = ConversionService.grams(30);
		System.out.println(grams);
		System.out.println(byteGrams); 

		
	}

}
