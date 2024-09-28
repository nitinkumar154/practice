package com.geeks.array;

import java.util.Scanner;

public class MissingElementInArray {

	public static int findMissingNumber(int [] arr , int n ) {
		
		int num =arr[0];
		int num1 = 1;
		for (int i = 1; i < arr.length; i++) {
			num = num ^arr[i];
		}
for (int i = 2; i <= arr.length+1; i++) {
	num1 = num1 ^ i;
	
}
		
		
System.out.println(num1^num);

		
		return 0;
	}
	
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
for (int i = 0; i < t; i++) {
//System.out.println("enter the number of element in array.");
int arrayLength = sc.nextInt();
int[] array = new int[arrayLength];

for (int j = 0; j <arrayLength ; j++) {
	array[j]=sc.nextInt();
}
findMissingNumber(array,array.length);
		
		
		
	}

	}
	}
