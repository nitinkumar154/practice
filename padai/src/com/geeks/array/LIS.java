package com.geeks.array;

public class LIS {

  public static void main(String[] args) {
    int[] A = { 1, 12, 7, 0, 23, 11, 52, 31, 61, 69, 70, 2 };
   
   findSubsequence(A);
    
    
    
  }

  private static void findSubsequence(int[] a) {
   int [] lis = new int[a.length];
   
   
   for (int i = 0; i < lis.length; i++) {
    int max = -1 ;
     for (int j = 0; j < i; j++) {
      if (a[j]>a[i]) {
        if (max == -1 || max < lis[j] + 1) {
          max = 1 + lis[j];
      }
        
      }
       
       
    }
     
     
  }
    
  }

}
