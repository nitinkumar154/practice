package com.padai;

import java.util.Scanner;
import java.util.Stack;

public class NextLargerElement {
	public static void printNextLargerElement(int[] arr , int length) {
		Stack<Integer> largerElement = new Stack<Integer>();
		int n=arr.length;
		for (int i = 0; i <n; i++) {
			int x = arr[i];
			if (largerElement.empty()) {
				largerElement.push(x);
				
			}  
			if(i==n-1) {
				System.out.print(-1+" ");
				break;
			}
				if (largerElement.peek()>x) {
					System.out.print(largerElement.peek()+" ");
				}
				else {
					int c = -1;
					int count = i+1;
				for (int j = count; j < arr.length; j++) {
					int next = arr[j];
					if (next>x) {
						c= j;
						largerElement.push(next);
						System.out.print(next+" ");
						break;
						
					}	
				}
				if ((c==arr.length)||(c==-1 )){
						System.out.print(-1+" ");					
				}
				}
		}
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
printNextLargerElement(array,arrayLength);




}
	}

}
