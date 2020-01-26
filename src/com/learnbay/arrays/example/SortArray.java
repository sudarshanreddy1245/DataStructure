package com.learnbay.arrays.example;

public class SortArray {
	
	public static void main(String[] args) {
		int[] array  = {4,3,5,2,1};
		sortArray(array);
		printAllTheElements(array);
	}
	
	private static void printAllTheElements(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

	private static void sortArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			while (array[i] != i+1 && array[i] >  0) {
				int temp = array[i];
				array[i] = array[temp-1];
				array[temp-1] = temp;
			}
		}
	}

}
