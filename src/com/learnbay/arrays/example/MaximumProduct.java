package com.learnbay.arrays.example;

import java.util.Arrays;

public class MaximumProduct {
	
	public static void main(String[] args) {
		int[] array = {1,5,3,0,-1,-4,10};
		Arrays.sort(array);
		int maxProductVal = 0;
		int length = array.length-1;
		if(length > 0) {
			maxProductVal = array[length] * array[length-1];
		}
		System.out.println(maxProductVal);
	}
	
	

}
