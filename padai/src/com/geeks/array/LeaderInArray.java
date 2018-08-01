package com.geeks.array;

import java.util.Scanner;

public class LeaderInArray {

  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
for (int i = 0; i < t; i++) {
int arrayLength = sc.nextInt();
int[] array = new int[arrayLength];

for (int j = 0; j <arrayLength ; j++) {
array[j]=sc.nextInt();
}
printLeaderInArray(array);
    
    

  }

}

  private static void printLeaderInArray(int[] array) {
        
    int ref = array[array.length-1];
    for (int i = array.length-1; i >=0 ; i--) {
if (array[i]>=ref) {
  System.out.print(array[i]+" " );
  ref = array[i];
  
}
      
      
      
    }
    
    
    
    
    
    
    
    
  }
}