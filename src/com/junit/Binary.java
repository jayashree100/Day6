package com.junit;

import java.util.Scanner;

public class Binary {
	static void toBinary(int n) {
		// array to store binary number
		int[] binaryNum = new int[1000];

		// counter for binary array
		int i = 0;
		while (n > 0) {
			// storing remainder in binary array
			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}

		// printing binary array in reverse order
		for (int j = i - 1; j >= 0; j--)
			System.out.print(binaryNum[j]);
	}

	static int swapNibbles(int n) {
		return ((n & 0x0F) << 4 | (n & 0xF0) >> 4);
	}

	static boolean isPowerOfTwo(int n) {
		return (int) (Math.ceil((Math.log(n) / Math.log(2)))) == (int) (Math.floor(((Math.log(n) / Math.log(2)))));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		
          int n = 106;
          toBinary(n);
		isPowerOfTwo(n);
		System.out.println(swapNibbles(n));
		System.out.println(isPowerOfTwo(n));

	}

}
