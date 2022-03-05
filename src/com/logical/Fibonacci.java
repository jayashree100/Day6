package com.logical;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the starting value of fibonacci");
			int fib1 = sc.nextInt();
			System.out.println("Enter the second second value");
			int fib2 = sc.nextInt();
			int fib3;
			
			System.out.println("Enterd first fib1 value is:" +fib1+"Entered +fib2+ value is fib:" +fib2);
			
			fib3 = fib1 + fib2;
			System.out.println("after adding fib3 value is :" +fib3);
			
			for(int i = 2; i < 10; i++) {
				
				fib3 = fib1 + fib2;
				fib1 = fib2;
				fib2 = fib3;
				
				System.out.println(+fib3);
			}
			
			
		
	}

}
