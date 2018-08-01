package com.geeks.search;

import java.util.Arrays;

public class BinarySearch {

  public static void main(String[] args) {
   
    int [] arr = {7,4,3,7,5,3,9,2,4,6,9,0,2,2,1};
    int element = 3;
    int index = binarySearch(arr,element );
    System.out.println(index);
  }

  public static int binarySearch(int[] arr, int element) {
    Arrays.sort(arr);
    int high = arr.length - 1;
    int low = 0;
    int ret = -1;
    while (low <= high) {
      int mid = (high + low) / 2;
      if (arr[mid] < element) {
        low = mid + 1;
      } else if (arr[mid] > element) {
        high = mid - 1;
      }
      if (arr[mid] == element) {
        high = mid - 1;
        ret = mid;
      }
    }
    return ret;
  }
}
