package com.junit;

import java.util.Scanner;

public class ToBinary {
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

	static int toDecimal(int[] list) {
		double sum = 0;
		int count = list.length - 1;
		for (int i : list) {
			sum += i * Math.pow(2, count);
			count -= 1;
		}
		return (int) sum;
	}

	static void checkPowerOf2(int number) {
		while(true) {
			if( number%2!=0) {
				System.out.println("This number in not a power of 2");
				break;
			}
			else if(number/2==1) {
				System.out.println("This number is  power of 2");
				break;
			}
			else {
				number=number/2;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		toBinary(n);

	}

}
