package com.example.utils;

import java.util.*;

public class LruCache extends LinkedHashMap<Integer, Integer>{

    private int capacity;
    public LruCache (int capacity){
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {

        LruCache lruCache = new LruCache(2);
        System.out.println("get (2): " + lruCache.get(2));
        lruCache.put(2, 6);
        System.out.println("get (1): " + lruCache.get(1));
        lruCache.put(1, 5);
        lruCache.put(1, 2);
        System.out.println("get (1): " + lruCache.get(1));
        System.out.println("get (2): " + lruCache.get(2));

//        LruCache lruCache = new LruCache(2);
//        lruCache.put(1, 1);
//        lruCache.put(2, 2);
//        System.out.println("current: " + lruCache.cache.toString());
//        System.out.println("get (1): " + lruCache.get(1));
//        lruCache.put(3, 3);
//        System.out.println("current: " + lruCache.cache.toString());
//        System.out.println("get (2): " + lruCache.get(2));
//        lruCache.put(4, 4);
//        System.out.println("current: " + lruCache.cache.toString());
//        System.out.println("get (1): " + lruCache.get(1));
//        System.out.println("get (3): " + lruCache.get(3));
//        System.out.println("get (4): " + lruCache.get(4));
    }
}
