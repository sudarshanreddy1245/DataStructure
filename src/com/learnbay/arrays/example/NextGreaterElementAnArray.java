package com.learnbay.arrays.example;

/*
 * https://classroom.google.com/u/2/c/NDg2NDU2Njg5ODla/a/NDg4ODY1MzMwOTZa/details
 */
public class NextGreaterElementAnArray {
	
	public static void main(String[] args) {
		int[] array = {11, 13, 21, 3, 42, 5};
		
		for (int i=0;i<array.length;i++) {
			boolean isNextGreaterNumAvailable = false;
			for(int j=i+1;j<array.length;j++) {
				if(array[i] < array[j]) {
					isNextGreaterNumAvailable = true;
					System.out.println(array[i] + "--->" + array[j]);
					break;
				}
			}
			if(!isNextGreaterNumAvailable)
				System.out.println(array[i]+" ---> " + -1);
			
		}
	}

}
