package com.learnbay.linkedlist;

public class Test {
	
	public static void main(String[] args) throws IllegalAccessException {
		CustomLinkedList list = new CustomLinkedList();
		
		//Scenario1: Insert At Begining
		//list.insertAtBegining(1);
		//list.insertAtBegining(2);
		//list.printAllElem(list.head);
		//System.out.println("--------");
		
		//Scenario2: Insert At End
		list.insertAtEnd(4);
		list.insertAtEnd(3);
		list.printAllElem(list.head);
		System.out.println("--------");
		
		//Scenario3: Search By Value
		//System.out.println(list.serachByValue(4));
		//System.out.println(list.serachByValue(10));
		//System.out.println("-------------");
		
		//Scenario4: Search By Index
		//System.out.println(list.serachByIndex(0));
		//System.out.println(list.serachByIndex(1));
		//System.out.println(list.serachByIndex(10));
		//System.out.println("-------------");
		
		//Scenario5: delete by value
		//list.deleteElem(3);
		//list.printAllElem();
		//System.out.println("-------------");
		
		//Scenario6: delete by value
		//list.deleteAtIndex(4);
		//list.printAllElem(list.head);
		
		//Scenario7: Sort the elements
		list.sort();
		
		
	}

}
