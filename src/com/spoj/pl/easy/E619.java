package com.spoj.pl.easy;

public class E619 {
	public static void main(String[] args) {
		hexOfFloatVariable(1f);
	}
	
	static void hexOfFloatVariable(float number) {
		int intBits = Float.floatToIntBits(number);
		
		String hexRep = Integer.toHexString(intBits);
		
		System.out.println(hexRep);
	}
}
