package com.learnbay.arrays.example;

/*
 * Find maximum Product of two integers in an array
 * Input  : -10, -3, 5, 6, -2
 * output : -10 and -3 
 *            5 and  6
 */
public class MaximumProduct {
	
	public static void main(String[] args) {
		int[] array = { -10, -3, 5, 6, -2 };
		
		int posHighest = Integer.MIN_VALUE;
		int posSecondHighest = Integer.MIN_VALUE;
		
		int negHighest = Integer.MIN_VALUE;
		int negSecondHighest = Integer.MIN_VALUE;
		
		for(int i=0;i<array.length;i++) {
			if(array[i] > posHighest) {
				posSecondHighest = posHighest;
				posHighest = array[i];
			} else if(array[i] > posSecondHighest && array[i] < posHighest) {
				posSecondHighest = array[i];
			}
			
			if(array[i] < 0 && (Math.abs(array[i]) > Math.abs(negHighest))) {
				negSecondHighest = negHighest;
				negHighest = array[i];
			} else if (array[i] < 0 && (Math.abs(array[i]) > Math.abs(negSecondHighest))) {
				negSecondHighest = array[i];
			}
		}
		
		if(negHighest*negSecondHighest > posHighest * posSecondHighest) {
			System.out.println(negHighest+" and " +negSecondHighest);
		} else if(negHighest*negSecondHighest >= posHighest * posSecondHighest) {
			System.out.println(negHighest+" and " +negSecondHighest);
			System.out.println(posHighest+ " and " + posSecondHighest);
		} else {
			System.out.println(posHighest+ " and " + posSecondHighest);
		}
	}

}
