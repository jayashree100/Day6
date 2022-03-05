package com.logical;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number");
		 int n = sc.nextInt();
		 int sum = 0;
		 
		 for ( int i = 1; i < n; i++) {
			 
			   if ( n % i == 0) {
				   
				   System.out.println(" n  divisiors are :" +i);
				   sum = sum + i;
				  
			   }
		 }
		 
		     System.out.println(+sum);
		 
		  		if ( sum == n ) {
		  			System.out.println("perfect number");
		  }
		  
		  else {
			   System.out.println("not perfect number");
		  }
		 

	}

}
