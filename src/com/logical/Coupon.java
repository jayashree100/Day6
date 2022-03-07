package com.logical;

import java.util.Scanner;

public class Coupon {
	
	      static int getCoupon(int N) {
	          
	    	   return (int) (Math.random() * N);
	    }
	
	 	public static void main(String args[]) {
	 		
	 		Scanner sc = new Scanner(System.in);
	 		System.out.println("Enter the String ");
	 		String str = sc.next();
	 		char[] ch = str.toCharArray();
	 		System.out.println("Enter the coupon N value");
	 		int N = sc.nextInt();
	 		
	 		int random = getCoupon(N);
	 		System.out.println(random);
	 			
	 		String sb = " ";
	 		
			while (random > 0) {
				sb = sb + (ch[random % ch.length]);
				random /= ch.length;
				System.out.println(random + "  " + random % ch.length + " sb is " + sb);
			}
			
			String couponCode = sb.toString();
			System.out.println("Coupon Code: " + couponCode);

	 } 
}


