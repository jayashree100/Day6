package com.logical;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		 	Scanner sc = new Scanner(System.in);	
		 	System.out.println("Enter the number");
		 	int number = sc.nextInt();
		 	int rev = 0;
		 	
		 	for ( int i = 0; i < number; i++) {
		 		    
		 		     int reminder = number % 10;
                     rev = rev * 10 + reminder;
			 		 number = number / 10;
		 		
		 		
		 	}
		 	
		 		System.out.println("after reversing the number is:" +rev);
		

	}

}
