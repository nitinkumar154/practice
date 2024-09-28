package com.padai;

/// wrong output is coming for 7814
import java.util.Scanner;
import java.util.Stack;

public class NextLargerElement {
  public static void printNextLargerElement(int[] arr, int length) {
    Stack<Integer> largerElement = new Stack<Integer>();
    boolean status = false;
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int nextel = arr[i];
      if (largerElement.empty()) {
        largerElement.push(nextel);
      }
      if (largerElement.peek() > nextel) {
        largerElement.push(nextel);
      } else {
        while (!largerElement.empty() && largerElement.peek() < nextel) {
          System.out.println(largerElement.peek() + "--->" + nextel + " ");
          largerElement.pop();
          status = true;
        }
        if (status) {
          largerElement.push(nextel);
          status = false;
        }
      }
      if (i == n - 1) {
        System.out.println(nextel + "---> -1");
        if (largerElement.peek() == nextel) {
          largerElement.pop();
        }
      }
    }
    while (!largerElement.empty()) {
      System.out.println(largerElement.pop() + "---> -1 ");
    }
  }
  public static void main(String[] args) {
    System.out.println("enter the number of test cases:");
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      System.out.println("enter the number of element in array.");
      int arrayLength = sc.nextInt();
      int[] array = new int[arrayLength];
      for (int j = 0; j < arrayLength; j++) {
        array[j] = sc.nextInt();
      }
      printNextLargerElement(array, arrayLength);
    }
  }
}
