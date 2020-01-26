package com.learnbay.arrays.example;

public class SmallestMissingPositiveNumber {
	
	public static void main(String[] args) {
		int[] array = {4,5,2,3,1,7};
		System.out.println(findMissingSmallestPositiveNum(array));
	}
	
	private static int findMissingSmallestPositiveNum(int[] array) {
		for(int i = 0 ; i< array.length ;i++) {
			while(array[i] != i+1 && array[i] > 0 && array[i] <= array.length) {
				int temp = array[i];
				array[i] = array[temp-1];
				array[temp-1] = temp;
			}
		}
		
		for(int i=0; i<array.length;i++) {
			if(array[i] != i+1) {
				return i+1;
			}
		}
		
		return -1;
	}

}
