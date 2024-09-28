package com.collection;

import java.util.HashMap;
import java.util.Map;

public class SumPair {

    public static void main(String[] args) {
        int arr [] ={0,1,2,3,4,5,6,7};
        printSumPair(arr, 7);


    }


    public static void printSumPair(int [] arr , int t){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< arr.length; i++){
            int val = arr[i];

            if(map.containsKey(val)){
                System.out.println(" pair is :"+ val+" and  "+map.get(val));
            }
            else{
                map.put(t-val, val);
            }
        }


    }


}
