package com.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Linked List");
        LinkedList<Integer> listOne = new LinkedList<>();
        listOne.add(56);
		listOne.add(30);
		listOne.add(70);
		listOne.show();
        if (listOne.search(30) == null) {
			System.out.println("Element not  found");
		} else {
			System.out.println("Element found");
		}
        if (!listOne.searchAndInsert(30, 40)) {
			System.out.println("Element not  found");
		} else {
			System.out.println("Element found and Deleted");
        }

        listOne.searchAndPop(40);
		listOne.show();
		listOne.size();

      
    }
}
