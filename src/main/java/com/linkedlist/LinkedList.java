package com.linkedlist;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
  
    // Method to Push the Data
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
   
    // Method to insert Data in between
    public void insert(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			Node<T> temp, current;
			current = head;
			temp = head.next;
			current.next = newNode;
			newNode.next = temp;
		}
	}

 
    // Method to Add in the List
    public void add(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		tail = newNode;
	}

    // Method to Display
    public void show() {
        if (head == null) {
            System.out.println("Linked list is Empty");
        } else {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
