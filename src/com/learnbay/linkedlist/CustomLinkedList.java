package com.learnbay.linkedlist;

/*
 * Create a class to implement following functions
1. Insert at Begining
2. Insert at End
3. Search by Value
4. Search By Index
5. Delete by Value
6. Delete By Index.
7. Sort
8. Reverse using recursion
9. Reverse using iteration.
10. Size of linkedList.
 */
public class CustomLinkedList {
	
	Node head ;
	//Node tail;
	
	public void insertAtBegining(int elem) {
		Node newNode = new Node(elem);
		
		if (head == null) {
			head = newNode;
			//tail = newNode;
		}
		else {
			Node temp = head;
			head = newNode;
			newNode.nextNode = temp;
		}
	}
	
	public void insertAtEnd(int elem) {
		
		Node newNode = new Node(elem);
		
		if (head == null) {
			head = newNode;
			//tail = newNode;
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
	
	public boolean serachByValue(int elem) {
		boolean isAvailable = false;
		if(head != null) {
			Node currNode = head;
			while (currNode != null) {
				if(currNode.data == elem) {
					isAvailable = true;
					break;
				}
				currNode = currNode.nextNode;
			}
		} else {
			System.out.println("List is Empty");
		}
		return isAvailable;
	}
	
	public int serachByIndex(int index) throws IllegalAccessException {
		if (head != null) {
			int count = 0;
			Node currNode = head;
			while(currNode != null) {
				if(count == index) {
					return currNode.data;
				}
				currNode = currNode.nextNode;
				count++;
			}
		}
		throw new IllegalAccessException("Index:"+index + " is not exist");
	}
	
	public boolean deleteElem(int elem) throws IllegalAccessException {
		boolean isDeleted = false;
		if(head == null) {
			System.out.println("List is empty");
		} else {
			
			if(head.data == elem) {
				head = head.nextNode != null ? head.nextNode : null;
				isDeleted = true;
			} else {
				Node prev = getPrevNodeByVal(elem);
				if (prev == null) 
					throw new IllegalAccessException("Element:"+elem + " not exist in linked list.");
				else {
					prev.nextNode = prev.nextNode.nextNode;
				}
			}
			
		}
		return isDeleted;
	}
	
	
	public boolean deleteAtIndex(int index) throws IllegalAccessException {
		boolean isDelete = false;
		if( head == null && index < 0) {
			System.out.println("It's invalid index");
		} else {
			if(index == 0) {
				head = head.nextNode != null ? head.nextNode : null;
				isDelete = true;
			} else {
				Node prev = getPrevNodeByIndex(index);
				if (prev == null) {
					throw new IllegalAccessException("Index:"+index+ " is not present the linked list.");
				} else {
					prev.nextNode = prev.nextNode.nextNode;
					isDelete = true;
				}
			}
			
		}
		return isDelete;
	}
	
	private Node getPrevNodeByVal(int val) {
		Node temp = head;
		Node prev = null;
		while(temp.nextNode != null) {
			if(temp.nextNode.data == val) {
				prev = temp;
				return prev;
			}
			temp = temp.nextNode;
		}
		return prev;
	}
	
	private Node getPrevNodeByIndex(int index) {
		Node temp = head;
		Node prev = null;
		int count = 1;
		while(temp.nextNode != null) {
			if(count == index) {
				prev = temp;
				return prev;
			}
			count++;
			temp = temp.nextNode;
		}
		return prev;
	}
	
	public void sort() {
		/*if(head == null) {
			System.out.println("list is empty");
		} else {
			Node currNode = head;
			while (currNode != null) {
				
					if(currNode.nextNode != null && (currNode.data > currNode.nextNode.data)) {
						Node temp = currNode;
						Node nextCurrNode = currNode.nextNode;
						
						currNode = currNode.nextNode;
						currNode.nextNode = temp;
						currNode.nextNode.nextNode = nextCurrNode.nextNode;
						currNode.nextNode.nextNode= null;
				}
					currNode = currNode.nextNode;
			}
			printAllElem(currNode);*/
		//}
			
		
		
	}
	
	enum Sorting {
		ASC,
		DESC;
	}
	
	public void printAllElem(Node head) {
		if(head != null) {
			Node temp = head;
			while (temp != null) {
				System.out.println("Element:"+temp.data);
				temp = temp.nextNode;
			}
		}
	}

}
