package com.learnbay.arrays.example;

import java.util.ArrayList;
import java.util.List;

public class MatrixSpiral {
	
	public static void main(String[] a) {
		int[][] array = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16},
				{17,18,19,20}
				};
		
		List<Integer> output = matrixSpiral(array);
		for(int val : output) {
			System.out.println(val );
		}
	}
	
	private static List<Integer> matrixSpiral(int[][] array) {
		List<Integer> list = new ArrayList<>();
		int rowBegin = 0;
		int rowEnd = array.length-1;
		int columnBegin = 0;
		int columnEnd = array[0].length-1;
		
		while (rowBegin <= rowEnd && columnBegin <= columnEnd) {
			
			for(int i=columnBegin ; i <= columnEnd; i++)
				list.add(array[rowBegin][i]);
			
			rowBegin++;
			
			for(int i = rowBegin; i <= rowEnd; i++) 
				list.add(array[i][columnEnd]);
			
			columnEnd--;
			
			if(rowBegin <= rowEnd) {
				for(int i=columnEnd;i>=columnBegin;i--)
					list.add(array[rowEnd][i]);
			}
			rowEnd--;
			
			if(columnBegin <= columnEnd) {
				for(int i=rowEnd;i >= rowBegin ;i--) {
					list.add(array[i][columnBegin]);
				}
			}
			columnBegin++;
			
		}
		return list;
	}

}
