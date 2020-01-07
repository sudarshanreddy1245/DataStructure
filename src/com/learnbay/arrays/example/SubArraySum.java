package com.learnbay.arrays.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArraySum {
	
	public static void main(String[] args) {
		int[] array = {3,4,3,-2,-5,1,3,1,-4,-2,-1};
		findSubArray(array);
	}

	private static void findSubArray(int[] array) {
		//Key: Sum value, Value:position
		Map<Integer,Integer> map = new HashMap<>();
		
		List<int[]> list = new ArrayList<>();
		
		int sumVal=0;
		
		for (int i=0;i<array.length;i++) {
			 sumVal+= array[i];
			 //If Map contain that sum value means the elements in the array is sum=0
			 if (!map.containsKey(sumVal)) {
				 map.put(sumVal, i);
			 } else {
				 list.add(splitSubArray(array, map.get(sumVal)+1, i));
			 }
		}
		
		printSubArray(list);
	}
	
	private static int[] splitSubArray(int[] array, int startIndex, int endIndex) {
		int[] subArray = new int[endIndex-startIndex+1];
		int pos = 0;
		for(int i = startIndex ;i <= endIndex; i++) {
			subArray[pos] = array[i];  
			pos++;
		}
		return subArray;
	}
	
	private static void printSubArray(List<int[]> subArrayList) {
		for(int[] subArray : subArrayList) {
			Arrays.stream(subArray).boxed().iterator().forEachRemaining(i->System.out.print(i + " "));
			System.out.println("\n");
			
			
		}
	}

}
