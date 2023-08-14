package com.padai.leetcode.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	 List<List<Integer>> res = new ArrayList<>();
	 Set<String> set = new HashSet<>();
	public static void main(String[] args) {
//		int [] nums = {-1,0,1,2,-1,-4};
	//	int [] nums = {0,1,1};
		int [] nums = {0,0,0,0};
		ThreeSum obj = new ThreeSum();
	System.out.println(obj.threeSum(nums));

	}
	
	 public List<List<Integer>> threeSum(int[] nums) {
	        Arrays.sort(nums);
	        for(int i =0 ; i< nums.length-2; i++){
	           
	            int restSum = -nums[i];

	            twoSum(i, nums, restSum);
	            
	        }
	        return res;
	        
	    }

	    public List<List<Integer>> twoSum(int i ,int[] nums, int target ){
	            int l = i+1;
	            int r = nums.length-1;
	            while(l<r){
	                   
	                int sum =  nums[l]+nums[r];
	                if(sum>target)
	                r--;
	                else if (sum<target)
	                l++;
	                else{
	                    while(nums[l]==nums[l+1]&& l<r-1 )
	                    l++;
	                    while(nums[r]==nums[r-1] && l<r-1)
	                    r--;
	                    List<Integer> result = new ArrayList<>();
	                    result.add(nums[i]); result.add(nums[l]);  result.add(nums[r]);
	                    
	                    if(set.add( ""+result.add(nums[i])+ result.add(nums[l])+  result.add(nums[r])))
	                   {  res.add(result);
	                   l++;r--;
	                    return res;
	                }
	                    else {
	                    	l++;r--;
	                    }
	                   }


	            }
	        return res;

	    }

}
