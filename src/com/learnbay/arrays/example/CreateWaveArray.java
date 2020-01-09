package com.learnbay.arrays.example;

/*
 * Input : 1 3 6 3 7 8 9 3 4 7 2 4
 * Ex output: 1 6 3 7 4 9 3 8 4 7 2 4

 */
public class CreateWaveArray {
	
	public static void main(String[] args) {
		int[] array = {1,3,6,4,7,8,9,3,4,7,2,4};
		createWaveArray(array);
		printAllElem(array);
	}
	
	private static void createWaveArray(int[] array) {
			for(int i=0;i< array.length-2 ; ) { 
				if(array[i] > array[i+1]) {
					swapArray(array, i, i+1);
				}
				
				if(array[i+1] < array[i+2]) {
					swapArray(array, i+1, i+2);
				}
				i+=2;
			}
		
	}
	
	
	
	private static void swapArray(int[] array,int firstIndex, int secondIndex) {
		int temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
	}
	
	private static void printAllElem(int[] array) {
		for(int i=0;i< array.length ; i++)
			System.out.print(array[i]+ " ");
		
	}

}
