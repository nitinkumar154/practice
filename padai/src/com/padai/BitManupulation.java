package com.padai;

public class BitManupulation {
	
	
	public static void main(String[] args) {
		Integer n = 3;
		System.out.println(n&1);
		System.out.println(Integer.toBinaryString(n));
		System.out.println(n.rotateLeft(1, 1));
	}

}
