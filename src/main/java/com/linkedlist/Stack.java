package com.linkedlist;

public class Stack<T> {
    LinkedList<Integer> stack = new LinkedList<>();

    public void push(Integer data) {
        stack.add(data);
    }

    public void popAll() {
        while (stack.size() != 0) {
            stack.show();
            stack.popFirst();
        }
    }

    public void show() {
        stack.show();
    }

    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.push(70);
        stack1.push(30);
        stack1.push(56);
        stack1.show();
        stack1.popAll();
    }
}
