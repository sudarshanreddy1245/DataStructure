package com.learnbay.arrays.example;

public class TowerOfHanoi {
	
	public static void towerOfHanoi(int num, char src, char dest, char temp) {
		if(num < 1) 
			return;
		towerOfHanoi(num-1, src, temp, dest);
		System.out.println("Move num:"+num+ " src:"+src+ " dst:"+dest);
		towerOfHanoi(num-1, temp, dest, src);
	}
	
	public static void main(String[] args) {
		towerOfHanoi(4, 'A', 'C', 'B');
	}

}
