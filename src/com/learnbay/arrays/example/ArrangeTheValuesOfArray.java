package com.learnbay.arrays.example;

/*
 * I/p: {8,-1,6,1,9,3,2,7,4,-1}
 * O/P: {-1,1,2,3,4,-1,6,7,8,9}
 */
public class ArrangeTheValuesOfArray {
	
	public static void main(String[] args) {
		int[] array = {3,2,1,4,-1,-1,6};
		indexArray(array);
		printAllElements(array);
	}
	
	private static void printAllElements(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private static void indexArray(int[] array) {
		int temp = 0;
		try {
			for (int i = 0; i < array.length; i++) {

				while (array[i] != -1 && array[i] != i) {
					temp = array[i];
					array[i] = array[temp];
					array[temp] = temp;
				}
			}
		} catch (ArrayIndexOutOfBoundsException aie) {
			array[temp] = -1;
		}
	}

}
