package com.geeks.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class SortingByFrequency {

  public static void main(String[] args) {
    int arr [] = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
    printFrequencyBasedSorting(arr);
  }

  private static void printFrequencyBasedSorting(int[] arr) {
   
Map<Integer, Integer> map = new HashMap<Integer,Integer>() ;
for (int i = 0; i < arr.length; i++) {
  int j = arr[i];
  
  if (map.containsKey(j)) {
    map.put(j, map.get(j)+1);
    
  } else {
    map.put(j, 1);
  }
  
}

java.util.List<Map.Entry<Integer  , Integer>> list =
new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());

Collections.sort(list , new Comparator<Map.Entry<Integer  , Integer>>() {

  @Override
  public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
    int k = o1.getValue().compareTo(o2.getValue());
    return k;
  }});
for(Map.Entry<Integer, Integer> entry:list){
 int count = entry.getValue();
 for (int i = 0; i < count; i++) {
  System.out.print(entry.getKey()+" ");
}
}
  }

}
