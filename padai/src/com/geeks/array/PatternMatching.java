package com.geeks.array;

public class PatternMatching {
  public static void main(String[] args) {
    String input  = "This is a test string";
    String pattern = "test";
    int i= 0 ;
    int j = 0;
    int startingIndex = 0; 
    while (i<input.length()) {
    
      while (i!=pattern.length()) {
        if (input.charAt(i)== pattern.charAt(j)) {
          i++;
          j++;
        } else {
          j= 0;
          i++;
        }
        
      }
      
    }
    
    
    
  }
  

}
