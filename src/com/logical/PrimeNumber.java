package com.logical;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int number = sc.nextInt();
			
			
			for ( int i = 2; i < number/2; i++) {
				
					if ( number % i == 0) {
						
						System.out.println("Entered number is not prime number");
						break;
					
						
					}
					
					else {
						
						System.out.println("Entered number is  prime number");
						break;
					}
					
			}

	}

}
