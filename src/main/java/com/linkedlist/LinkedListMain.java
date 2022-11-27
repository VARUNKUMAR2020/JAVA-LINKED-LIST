package com.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Linked List");
        LinkedList<Integer> listOne = new LinkedList<>();
        listOne.push(56);
        listOne.push(70);
        listOne.add(30);
		listOne.show();
		Integer popLastElement = listOne.popLast();
		if (popLastElement == null) {
			System.out.println("Linked List Empty");
		} else {
			System.out.println("Popped the last element -> " + popLastElement);
		}
		listOne.show();
      
    }
}
