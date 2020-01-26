package com.learnbay.arrays.example;

public class MaxCircularSum {
	
	public static void main(String[] args) {
		int[] array = {10,9,8,7,6,5,4,3,2,1};
		System.out.println(circularSum(array, 10));
	}
	
	private static int circularSum(int[] array,int size) {
		int sumVal = 0;
		int currVal = 0; 
		int maxVal = 0;
		
		for(int i=0;i<size;i++) {
			sumVal += array[i];
			currVal += (i*array[i]);
		}
		
		for(int i=1;i<size;i++) {
			currVal = (currVal+sumVal) - (size*array[size-1]);
			if(currVal > maxVal)
				maxVal = currVal;
		}
		
		maxVal = currVal;
		
		
		return maxVal;
		
	}

}
