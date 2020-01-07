package com.learnbay.arrays.example;

/*
 * Question : Minimum Sum Sub Array of size given size K
 * Input : 10, 4, 3, 5 , 6, 3, 8 , 1
 * Output : Index 1 to 3 with Sum as 12
 */
public class MinSumSubArray {
	
	public static void main(String[] args) {
		int[] array = {10, 4, 3, 5 , 6, 3, 8 , 1};
		minSumSubArray(array, 1, 3);
	}
	
	private static void minSumSubArray(int[] array, int startIndex, int endIndex) {
		int sum = 0;
		if(startIndex < array.length && endIndex <= array.length) {
			for(int i=startIndex;i<array.length;i++) {
				if(i <= endIndex) {
					sum+= array[i];
				}
			}
		}
		
		if(sum != 0) {
			System.out.println("Index "+ startIndex+" to " + endIndex + " with sum as " + sum);
		} else {
			System.out.println("Array length is not matching please check the inputs..");
		}
		
	}

}
