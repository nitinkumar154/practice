package com.geeks.array;

public class KadanesAlgo {

  public static void main(String[] args) {
    
    int arr [] = {-2, -3, 4, -1, -2, 1, 5, -3};
    
    System.out.println("max sub array sum is :"+findMaxSubArraySum(arr));
    

  }

  private static int findMaxSubArraySum(int[] arr) {
    int max_so_far = Integer.MIN_VALUE;
    int max_ending_here = 0;
    
    for (int i = 0; i < arr.length; i++) {
      max_ending_here = max_ending_here + arr[i];
      if (max_ending_here> max_so_far) {
        max_so_far = max_ending_here;
      }
if (max_ending_here<0) {
  max_ending_here = 0;
  
}      
      
    }
        
        
        
    
    
    return max_so_far;
  }

}
