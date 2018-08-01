package com.geeks.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LargestNumFromArray {

  public static void main(String[] args) {
    System.out.println("enter the number of test cases:");
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
for (int i = 0; i < t; i++) {
System.out.println("enter the number of element in array.");
int arrayLength = sc.nextInt();
int[] array = new int[arrayLength];

for (int j = 0; j <arrayLength ; j++) {
array[j]=sc.nextInt();
}
formGreatestNumberfromArray(array);
    
    
    
    
    
    
  }

}

  private static void formGreatestNumberfromArray(int[] array) {
      List<String> list = new ArrayList<String>();
    for (int i = 0; i < array.length; i++) {
      list.add(String.valueOf(array[i]));
    }
    Collections.sort(list, new Comparator<String>() {

      @Override
      public int compare(String x, String y) {
        String xy = x + y;
        
        String yx = y + x ;
        return Integer.valueOf(yx).compareTo(Integer.valueOf(xy));
      }
      
    });
    
    Iterator it = list.iterator();
    while (it.hasNext()) {
      System.out.print( it.next()+" ");
      
    }
    
  }
}