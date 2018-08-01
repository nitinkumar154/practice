package com.geeks.array;

public class LongestSubSequesce {

  public static void main(String[] args) {
    int arr [] = {10,22,9,33,21,50,41,60,80};
    System.out.println(FindLengthOfLis(arr));

  }

  private static int FindLengthOfLis(int[] arr) {
    int Lis = 1;
    int ref = arr[0];
for (int i = 1; i < arr.length; i++) {
  
  
  if (arr[i]>ref) {
    Lis = Lis+1;
    ref = arr[i];
  }
}


    
    
    return Lis;
  }

}
