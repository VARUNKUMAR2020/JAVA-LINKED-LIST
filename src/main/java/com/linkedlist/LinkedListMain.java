package com.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Linked List");
        LinkedList<Integer> listOne = new LinkedList<>();
        listOne.push(70);
        listOne.push(56);
        listOne.insert(30);
        listOne.show();
        Integer popFirstElement = listOne.popFirst();
		if (popFirstElement == null) {
			System.out.println("Linked List Empty");
		} else {
			System.out.println("Popped the first element -> " + popFirstElement);
		}
		listOne.show();
      
    }
}
