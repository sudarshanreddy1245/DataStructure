package com.learnbay.arrays.example;

/*
 * Given an array of DISTINCT elements, rearrange the elements of array in zig-zag fashion in O(n) time. The converted array should be in form a < b > c < d > e < f.
Example:

Input: arr[] = {4, 3, 7, 8, 6, 2, 1}
Output: arr[] = {3, 7, 4, 8, 2, 6, 1}
 */
public class ConverArrayZigZagIterator {
	
	public static void main(String[] args) {
		
		//int[] array = {4, 3, 7, 8, 6, 2, 1};
		int[] array = {1,4,3,2,5,1,0};
		convertZigZagFormat(array);
		printAllElemets(array);
	}
	
	private static int[] convertZigZagFormat(int[] array) {
		for (int i = 0;i<array.length-1;i=i+2) {
			if(array[i] > array[i+1]) {
				swapElem(array, i, i+1);
			} else if(array[i+1] < array[i+2]) {
				swapElem(array, i+1, i+2);
			}
		}
		return array;
	}
	
	private static void swapElem(int[] array, int pos1, int pos2) {
		int tempVal = array[pos1];
		int pos1Val = array[pos2];
		int pos2Val = tempVal;
		array[pos1] = pos1Val;
		array[pos2] = pos2Val;
	}
	
	private static void printAllElemets(int[] array) {
		for(int i=0;i<array.length;i++) 
			System.out.print(array[i] + "\t");
	}

}
