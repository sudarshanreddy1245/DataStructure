package com.learnbay.arrays.example;

public class MaxAndMinArray {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		findMaxMinFormat(array);
		printAllTheElements(array);
	}
	
	private static void findMaxMinFormat(int[] array) {
		int[] aux = new int[array.length];
		for( int i=0;i<array.length;i++) {
			aux[i] = array[i];
		}
		
		int start = 0 ;
		int stop = array.length-1;
		
		for( int i=0;i<array.length;i++) {
			if(i%2 == 0) {
				array[i] = aux[stop];
				stop = stop-1;
			} else {
				array[i] = aux[start];
				start+= 1;
			}
		}
	}
	
	private static void printAllTheElements(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}


}
