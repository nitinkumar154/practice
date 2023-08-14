package com.padai.leetcode.easy.string;

public class IsPalindrom {

	public static void main(String[] args) {
		System.out.println(isPalindrome("1b1"));

	}
	 public static boolean isPalindrome(String s) {
		 
		 s = s. replaceAll("[^a-zA-Z0-9]", "");
		 if(s==""||s.length()==1)
			 return true;
	        int l = 0 ;
	        int r = s.length()-1;
	        s= s.toLowerCase();
	        
	        while(l<r){
//	            int a = s.charAt(l++);
//	            
//	            while((a<97 || a>122) && l<s.length()&& l<r ){
//	                 a = s.charAt(l++);
//	            }
//	            System.out.println(""+(char)(a));
//	            int b = s.charAt(r--);
//	            while((b<97 || b>122)&& r>=0&&l<r) {
//	                 b = s.charAt(r--);
//	            }
//	            System.out.println(""+(char)(b));
//	            if(a==b){}
//	            else{
//	                return false;
//	            }
//	        }
//	        return true;
	        	
	        	if(s.charAt(l)!=s.charAt(r))
	        		return false;
	        	
	        	l++;
	        	r--;
	        }
	        	
	        	return true;
	        
	    }

}
