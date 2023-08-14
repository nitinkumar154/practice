package com.padai.leetcode.easy.array;

import java.util.Arrays;

public class LongestSubSeq {

	public static void main(String[] args) {
		int [] nums= {1,2,0,1};
		System.out.println(new LongestSubSeq().longestConsecutive(nums));

	}
	public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        Arrays.sort(nums);
        int maxLen= 1;
        int len= 1;
        for(int i = 1 ; i< nums.length;i++){
        	System.out.println(""+nums[i]+" : "+nums[i-1]);
        	if(!(nums[i]==nums[i-1] )&& nums[i]==nums[i-1]+1)
            {
            	
                len=len+1;
                System.out.println("len:"+len+" maxLen:"+maxLen);
                if(maxLen<len){
                    maxLen= len;
                }
                
            }
        	
        		else {
            	 len=1;
            }
        }
        return maxLen;
    }

}
