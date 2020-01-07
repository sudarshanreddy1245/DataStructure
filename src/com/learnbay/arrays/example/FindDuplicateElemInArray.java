package com.learnbay.arrays.example;

import java.util.ArrayList;
import java.util.List;

/*
 * Expected time complexity is of O(n).
 * Note you cannot use Set or Map for this problem.
 * Given Range : 0 to 10.
 * Input : 1,2,2,2,2,4,5,7,8,8
 * Output : 2, 8
 * Every duplicate element should be printed only once.
 
 */
public class FindDuplicateElemInArray {
	
	public static void main(String[] args) {
		int[] array = {1,2,2,2,2,4,5,7,8,8};
		printDuplicateElem(array);
	}
	
	private static void printDuplicateElem(int[] array) {
		List<Integer> uniqueListResult = new ArrayList<>();
		List<Integer> duplicateList = new ArrayList<>();
		for(int i=0;i<array.length;i++) {
			//checking duplicate element if list not contain the element add to the list
			if(!uniqueListResult.contains(array[i])) {
				uniqueListResult.add(array[i]);
			} 
			else {
				//Adding only one duplicate value to the list
				if(!duplicateList.contains(array[i])) {
					duplicateList.add(array[i]);
				}
					
			}
		}
		
		System.out.println(duplicateList);
	}

}
