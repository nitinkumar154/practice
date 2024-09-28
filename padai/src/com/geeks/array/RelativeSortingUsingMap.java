package com.geeks.array;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RelativeSortingUsingMap {

  public static void main(String[] args) {
    int a1 [] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
    int a2[]={2, 1, 8, 3,15};
    a1=  relativeSort(a1,a2);

  }

  private static int[] relativeSort(int[] a1, int[] a2) {
    Map<Integer, Integer> mapCount = new HashMap<>();
    for (int i = 0; i < a1.length; i++) {
      if (mapCount.containsKey(a1[i])) {
        mapCount.put(a1[i], mapCount.get(a1[i])+1);
      } else {
          mapCount.put(a1[i], 1);
      }
    }
    int ind = 0;
    for (int i = 0; i < a2.length; i++) {
      if (mapCount.containsKey(a2[i])) {
        for (int j = 0; j < mapCount.get(a2[i]); j++) {
          a1[ind++]= a2[i];
        }
        mapCount.remove(a2[i]);
        
      }
    }
    
    Map<Integer, Integer> treemap = new TreeMap<>(mapCount);
    for (Map.Entry<Integer, Integer> entry : treemap.entrySet()) {
      for (int i = 0; i < entry.getValue(); i++) {
        a1[ind++]= entry.getKey();
      }
      
      
    }
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
