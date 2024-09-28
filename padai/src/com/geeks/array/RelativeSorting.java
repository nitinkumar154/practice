package com.geeks.array;

import java.util.Arrays;
import com.geeks.search.BinarySearch;

public class RelativeSorting {

  public static void main(String[] args) {
   int a1 [] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
   int a2[]={2, 1, 8, 3,15};
   a1=  relativeSort(a1,a2);
   
   
   

  }

  public static int[] relativeSort(int[] a1, int[] a2) {
   int [] temp = new int [a1.length];
   int [] visited = new int [a1.length];
   for (int i = 0; i <a1.length; i++) {
     temp[i] = a1[i];
     visited[i] = 0;
  }
Arrays.sort(temp);
int ind = 0;

for (int i = 0; i < a2.length; i++) {
  int firstOccurance = BinarySearch.binarySearch(temp, a2[i]);
  
  if (firstOccurance ==-1) {
    continue;
  }
  for (int j = firstOccurance; (j < a1.length && temp[j]==a2[i]); j++) {
   a1[ind++] = temp[j];
   visited[j] = 1;
    
  }
  
}


for (int i = 0; i < a1.length; i++)
  if (visited[i] == 0)
      a1[ind++] = temp[i];
   
   for (int i = 0; i < a1.length; i++) {
    System.out.print(a1[i]+", ");
  }
   System.out.println("");
   for (int i = 0; i < a2.length; i++) {
     System.out.print(a2[i]+", ");
   }
    return a1;
  }

}
