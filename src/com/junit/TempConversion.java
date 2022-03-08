package com.junit;

import java.util.Scanner;

public class TempConversion {
	static void tempConvert(double temp, int cond) {
		if (cond == 0) {
			double f = temp * 9 / 5 + 32;
			System.out.println("Temperature in Fahrenheit : " + f + "F");
		} else {
			double c = (temp - 32) * 5 / 9;
			System.out.println("Temperature in Celsius : " + c + "C");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Press 0 to find temp in Fahrenheit & press 1 to find temp in celsius:");
		int cond = scan.nextInt();
		System.out.println("Enter the temperature :");
		double temp = scan.nextDouble();
		tempConvert(temp, cond);

	}

}
