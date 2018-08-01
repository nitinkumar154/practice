package com.geeks.array;

import java.util.Arrays;

public class SortArray012s {
  public static void main(String[] args) {
    int A[] = {0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0};
    threeWaySort(A, A.length - 1);
    System.out.println(Arrays.toString(A));
  }

  public static void threeWaySort(int[] A, int end) {
    int mid = 0;
    int ref = 1;
    int start = 0;

    while (mid <= end) {
      if (A[mid] < ref) {
        swap(A, start, mid);
        mid = mid + 1;
        start = start + 1;
      } else if (A[mid] > ref) {
        swap(A, mid, end);
        end = end - 1;
      } else {
        mid = mid + 1;
      }
    }
  }

  private static void swap(int[] A, int i, int j) {
    int temp = A[i];
    A[i] = A[j];
    A[j] = temp;
  }
}
