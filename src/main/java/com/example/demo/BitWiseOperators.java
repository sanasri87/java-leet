package com.example.demo;

public class BitWiseOperators {
	
	public static void main(String[] args) {
		
		/*
		 * int a = 10; //printToBinary(a); a<<=2; System.out.println(a);
		 * printToBinary(a);
		 * 
		 */
		/*
		 * double d = 10.0002d; int i = (int)d; System.out.println(i);
		 */
		
		int i = 7;
		
		System.out.println(i<<0);
	}
	
	public static void printToBinary(int i) {
		System.out.println(Integer.toBinaryString(i));
	}

	public static void divide(int d1 , int d2) {
	
		
		System.out.println(Math.exp(Math.log(d1)-Math.log(d2)));
		
	}
	
}
