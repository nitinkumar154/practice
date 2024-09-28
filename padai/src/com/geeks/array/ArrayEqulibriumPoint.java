package com.geeks.array;

public class ArrayEqulibriumPoint {

  public static void main(String[] args) {
   //int arr [] = {1, 3 ,5, 2, 2};
   int arr [] = {1};
   System.out.println(findEqulibriumPoint(arr));

  }

  private static int findEqulibriumPoint(int[] arr) {

    int leftSum = 0 ;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = sum+arr[i];
    }
    for (int i = 0; i < arr.length; i++) {
      sum = sum- arr[i]; // right sum ;
      if (sum==leftSum) {
        return i;
      }
      
      leftSum = leftSum+arr[i];
    }
    
    
    
    return -1;
  }

}
