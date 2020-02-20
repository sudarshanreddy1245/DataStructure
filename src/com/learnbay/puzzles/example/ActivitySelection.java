package com.learnbay.puzzles.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Pair
{
	private int start, finish;

	public Pair(int start, int finish) {
		this.start = start;
		this.finish = finish;
	}

	public int getFinish() {
		return finish;
	}

	public int getStart() {
		return start;
	}

	@Override
	public String toString() {
		return "{" + getStart() + ", " + getFinish() + "}";
	}
}

public class ActivitySelection {
	
	public static List<Pair> outPutResult = new ArrayList<>();
	
	public static void main(String[] args) {
		// list of given jobs. Each job has an identifier, a deadline and
				// profit associated with it
				List<Pair> activities = Arrays.asList(new Pair(1, 4), new Pair(3, 5),
						new Pair(0, 6), new Pair(5, 7), new Pair(3, 8),
						new Pair(5, 9), new Pair(6, 10), new Pair(8, 11),
						new Pair(8, 12), new Pair(2, 13), new Pair(12, 14));

				// Sort the activities according to their finishing time
				Collections.sort(activities, (a, b) -> a.getFinish() - b.getFinish());
				System.out.println("After Sorting:" +activities);
				
				System.out.println("--------------");
				
				
				activitySelection(activities);
				System.out.println("Output Result:" +outPutResult);
				
	}
	
	
	public static void activitySelection(List<Pair> activities) {
		
		Pair pairDetails;
		
		
		
		if(activities != null) {
			
			pairDetails = activities.get(0);
			
			outPutResult.add(activities.get(0));
			
			
			for(int i=1 ; i<activities.size(); i++) {
				if(pairDetails.getFinish() < activities.get(i).getStart() ) {
					outPutResult.add(activities.get(i));
					pairDetails = activities.get(i);
				}
			}
		}
		
		
		
		
	}

}
