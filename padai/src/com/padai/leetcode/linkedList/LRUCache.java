package com.padai.leetcode.linkedList;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1,1);
        cache.put(2,2);
        System.out.println(cache.get(1));
        cache.put(3,3);
        System.out.println(cache.get(2));
        cache.put(4,4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));



    }
    int c; //capacity
    Deque<CacheEntry> dq;
    Map<Integer, CacheEntry> map;
    public LRUCache(int capacity) {
        map= new HashMap<>();
        this.c=capacity;
        dq = new LinkedList<>();

    }

    public int get(int key) {
        if(map.containsKey(key)){
            CacheEntry e = map.get(key);
            dq.remove(e);
            dq.addFirst(e);
            return e.val;

        }
        else{
            return -1;
        }

    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            CacheEntry e1 = map.get(key);
            dq.remove(e1);
            CacheEntry e2 = new CacheEntry(key,value);
            map.put(key,e2);
            dq.addFirst(e2);

        }
        else{
            if(dq.size()<c){
                CacheEntry e1 = new CacheEntry(key,value);
                map.put(key, e1);
                dq.addFirst(e1);



            }
            else{
                CacheEntry e1 = new CacheEntry(key,value);
                CacheEntry e2 = dq.removeLast();
                map.remove(e2.key);
                map.put(key, e1);
                dq.addFirst(e1);

            }
        }


    }

}
class CacheEntry{
    int key ;
    int val;
    public CacheEntry(int key , int val){
        this.key = key ;
        this.val = val;
    }
}

