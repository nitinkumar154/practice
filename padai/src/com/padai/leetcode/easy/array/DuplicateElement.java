package com.padai.leetcode.easy.array;

public class DuplicateElement {
	
	public static void main(String[] args) {
		int [] arr = {0,0,1,1,1,2,2,3,3,4,4,4};
		System.out.println(removeDuplicates(arr));
	}
	 public static int removeDuplicates(int[] nums) {
	        int size= nums.length;
	        
	        if(size==1 || size==0)
	            return size;
	        int j = 0;
	        for(int i = 0 ; i<size-1 ;i++){
	            if(nums[i]!=nums[i+1]){
	                nums[j++]= nums[i];
	            }
	        }
	         nums[j++] = nums[size-1];
	      
	        return j;
	        
	    }
}
