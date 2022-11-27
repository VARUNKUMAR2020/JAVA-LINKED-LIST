package com.linkedlist;

public class LinkedListMain 
{
    public static void main( String[] args )
    {
        System.out.println( "Linked List" );
        LinkedList<Integer> list = new LinkedList<>();
		list.push(70);
		list.push(30);
		list.push(56);
		list.show();
    }
}
