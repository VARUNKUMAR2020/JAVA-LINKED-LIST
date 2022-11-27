package com.linkedlist;

public class LinkedListMain 
{
    public static void main( String[] args )
    {
        System.out.println( "Linked List" );
        LinkedList<Integer> listOne = new LinkedList<>();
		listOne.push(70);
		listOne.push(30);
		listOne.push(56);
		listOne.show();


        LinkedList<Integer> listTwo = new LinkedList<>();
		listTwo.add(56);
		listTwo.add(30);
		listTwo.add(70);
		listTwo.show();
    }
}
