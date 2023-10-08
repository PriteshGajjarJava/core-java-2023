package com.test;
import com.pga.Addition;
public class ArithmeticCalculator {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		int ans = Addition.add(a, b);
		System.out.println("answer is: " + ans);
	}
}
