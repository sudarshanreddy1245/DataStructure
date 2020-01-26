package com.learnbay.puzzles.example;

public class PetroPump {
	
	private static int getStartIndex(int[] petrol,int[] dist) {
		int nPumps = petrol.length;
		int start,currPetrol;
		int i=start=0;
		while(start<nPumps) {
			
			currPetrol = petrol[i] - dist[i];
			while(currPetrol >=0) {
				i = (i+1) % nPumps;
				currPetrol = currPetrol + petrol[i] - dist[i];
				if ( i == start) 
					return start;
			}
			
			start = ++i;
			i= i % nPumps;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] dist = {4,7,4,8,4,1};
		int[] petrol = {3,5,3,8,3,6};
		
		int index = getStartIndex(petrol, dist);
		if(index == -1)
			System.out.println("Solution Does not exist");
		else
			System.out.println("Petrol Pump Number : " +(index + 1));
		
	}

}
