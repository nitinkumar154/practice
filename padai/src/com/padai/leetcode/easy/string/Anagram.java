package com.padai.leetcode.easy.string;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("rat", "car"));

	}
	 public static boolean isAnagram(String s, String t) {
		 int len = s.length();
	        int l=0 ;
	        int r= len-1;
	        Map<Character, Integer>map = new HashMap<>();
	        while(l<len){
	            Character c = s.charAt(l++);
	            map.put(c, map.getOrDefault(c, 0)+1);
	           
	        }
	        l=0;
	        while(l<len){
	           Character c = s.charAt(l++); 
	            if(map.containsKey(c)){
	                int val = map.get(c);
	                if(val==1)
	                    map.remove(c);
	                else
	                map.put(c, map.get(c)-1);
	            }
	            else{
	                return false;
	            }
	        }
	        if(map.isEmpty())
	            return true;
	        return false;	
	    }

}
