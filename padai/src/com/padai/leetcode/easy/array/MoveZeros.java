package com.padai.leetcode.easy.array;

public class MoveZeros {

	public static void main(String[] args) {
		int arr [] ={1,0}; 
		moveZeroes(arr);

	}
	public static void moveZeroes(int[] nums) {
	       //  int arr [] = new int [nums.length];
	       //  int j = 0;
	       //  for(int i =0 ; i<nums.length; i++){
	       //      if(nums[i]!=0){
	       //          arr[j++]= nums[i];
	       //      }
	       //  }
	       //  for(int k= j ; k<nums.length;k++){
	       //      arr[k]=0;
	       //  }
	       //  int z= 0;
	       // for(int a: arr){
	       //     nums[z++]= a;
	       // }
	        
	        int z = 0;
	        int n = 0;
	        while(n<nums.length && z<nums.length){
	            while(z<nums.length && nums[z]!=0   ){
	                z++;
	            }
	            while(n<nums.length && nums[n]==0  ){
	                n++;
	            }
	            if(n<nums.length&&z<nums.length && z<n )
	            swap(nums, n,z);
	        }
	        
	        
	        
	    }
	    public static void swap(int nums[], int a , int b){
	        
	        int temp = nums[a];
	        nums[a]= nums[b];
	        nums[b] = temp;
	        
	    }

}
