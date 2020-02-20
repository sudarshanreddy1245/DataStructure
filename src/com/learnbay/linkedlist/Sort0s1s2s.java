package com.learnbay.linkedlist;

/**
 * Input : 2->2->1->0->1->0
 * Output: 0->0->1->1->2->2
 * @author sudarshan.reddy
 *
 */
public class Sort0s1s2s {
	
	private static Node head;
	
	public static void main(String[] args) {
		
		insertNode(2);
		insertNode(1);
		insertNode(2);
		insertNode(1);
		insertNode(0);
		insertNode(0);
		sortLinkedList();
		printAllElem();
		
	}
	
	public static void insertNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp != null) {
				if(temp.nextNode == null) {
					temp.nextNode = newNode;
					break;
				}
				temp = temp.nextNode;
			}
			
			
		}
	}
	
	
	public static void sortLinkedList() {
		int[] countArray = new int[3];
		Node curr = head;
		while(curr != null) {
			if(curr.data == 0) 
				++countArray[curr.data];
			else if(curr.data == 1)
				++countArray[curr.data];
			else
				++countArray[curr.data];
			
			curr = curr.nextNode;
		}
		
		head = null;

		for(int i=0 ; i< countArray.length; i++) {
			while (countArray[i] > 0) {
				insertNode(i);
				--countArray[i];
			}
			
		}
	}
	
	public static void printAllElem() {
		Node curr = head;
		while (curr != null) { 
			System.out.println(curr.data);
			curr = curr.nextNode;
			
		}
	}

}
