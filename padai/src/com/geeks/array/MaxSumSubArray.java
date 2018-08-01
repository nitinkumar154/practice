package com.geeks.array;

import java.util.Scanner;

public class MaxSumSubArray {
	public static void kadanesAlgo(int arr [] , int l) {
			int MSF = arr[0];
			int MEH = 0;
			for (int i = 0; i < arr.length; i++) {
				MEH = MEH +arr[i];
				if (MEH<0) {
					MEH= 0 ;
				}
				if (MEH>MSF) {
					MSF = MEH;
				}
			}
					System.out.println(MSF);
	}
	public static void main(String[] args) {
System.out.println("enter the number of test cases:");
		
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
for (int i = 0; i < t; i++) {
System.out.println("enter the number of element in array.");
int arrayLength = sc.nextInt();
int[] array = new int[arrayLength];

for (int j = 0; j <arrayLength ; j++) {
	array[j]=sc.nextInt();
}
kadanesAlgo(array,array.length);

}
	}

}
