package com.learnbay.linkedlist;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * LRU (least recent;lu used) which one is not used those elements deleted and add new element when the capacity is full.
 */
public class LRUCache {
	
	private LinkedHashMap<Integer, Integer> linkedHashMap;
	private final int  CAPACITY;
	
	@SuppressWarnings({ "serial" })
	public LRUCache(int capacity) {
		this.CAPACITY = capacity;
		linkedHashMap = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
			@SuppressWarnings("rawtypes")
			protected boolean removeEldestEntry(Map.Entry eldest) 
            { 
                return size() > CAPACITY; 
            } 
		};
	}
	
	
	public int get(int key) {
		return linkedHashMap.getOrDefault(key,-1);
	}
	
	
	public void set(int key, int value) {
		linkedHashMap.put(key, value);
	}
	
	public void printAllElement() {
		for(Entry<Integer, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey()+ "\t"+entry.getValue());
		}
	}
	
	
	public static void main(String[] args) {
		LRUCache lruCache = new LRUCache(2);
		
		//Scenario1 : Key on need to remove 1 key
		lruCache.set(1, 1);
		lruCache.set(2, 2);
		lruCache.get(1);
		lruCache.set(3, 3);
		
		
		
		lruCache.printAllElement();
		
		
	}

}
