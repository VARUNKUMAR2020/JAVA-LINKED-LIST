package com.linkedlist;

public class Queue {
    LinkedList<Integer> queue = new LinkedList<>();

    public void enqueue(Integer data) {
        queue.add(data);
    }

    public void show() {
        queue.show();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.show();
    }
}
