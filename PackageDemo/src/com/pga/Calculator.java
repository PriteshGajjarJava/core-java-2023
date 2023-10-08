package com.pga;
import com.maths.Addition;

public class Calculator {
	public static void main(String[] args) {
		Addition obj = new Addition();
		int ans = obj.add(5, 10);
		System.out.println("Answer is: " + ans);
	}
}
