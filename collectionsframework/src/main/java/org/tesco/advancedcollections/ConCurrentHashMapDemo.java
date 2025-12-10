package org.tesco.advancedcollections;

import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentHashMapDemo {
    public static void main(String[] args) {
        //if any threads are adding elements into array: dont use reguarlar collection:
        //use ThreadSafeCollection
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1, "Test");
        System.out.println(concurrentHashMap);
    }
}
