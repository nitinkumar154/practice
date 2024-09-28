package com.padai.leetcode.easy.array;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		rotate(arr, 2);

	}

	   public static void rotate(int[] arr, int d) {
	        d=   d%arr.length;
	     reverse(arr, 0 , arr.length-1);
	     reverse(arr, 0 , d-1);
	     reverse(arr,d,arr.length-1);
	        
	    }
	    public static void reverse(int[] arr,int s, int e ){
	        while(s<e){
	            int temp= arr[s];
	             arr[s]= arr[e];
	            arr[e]= temp;
	            s++;e--;
	                
	        }
	    }

}
