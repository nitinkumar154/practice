package com.geeks.array;

import java.util.Scanner;

public class SprialMatrix {

  public static void main(String[] args) {


    int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},{10,11,12},{13,14,15}};
    // 1  2  3  4
    // 5  6  7  8
    // 9  10 11 12
    // 13 14 15 16
    
    // 1  2  3
    // 4  5  6
    // 7  8  9
    // 10 11 12
    // 13 14 15



    printSprialArray(arr, 5, 3);




  }

  private static void printSprialArray(int[][] arr, int row, int col) {

    int rIndex = 0;
    int cIndex = 0;
    int i;

    while (rIndex < row && cIndex < col) {
      for (i = cIndex; i < col; i++) {
        System.out.print(arr[rIndex][i] + "  ");
      }
      rIndex++;
      for (i = rIndex; i < row; i++) {
        System.out.print(arr[i][col - 1] + "  ");
      }
      col--;

     if (rIndex < row) {
        for (i = col - 1; i >= cIndex; --i) {
          System.out.print(arr[row - 1][i] + "  ");
        }
        row--;
    }
    if (cIndex < col) {
        for (i = row - 1; i >= rIndex; i--) {
          System.out.print(arr[i][cIndex] + " ");
        }
        cIndex++;
     }

    }



  }

}
