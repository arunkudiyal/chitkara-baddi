package com.company;

public class StackUsingLL {

    private static class Node {
        int data;
        Node next;
    }

    static Node top;

    // Default Constructor
    StackUsingLL() {
        this.top = null;
    }

    public void push(int data) {
        // create a node
        Node temp = new Node();
        // Stack Overflow
        if(temp == null) {
            System.out.println("STACK OVERFLOW!");
            return;
        }
        temp.data = data;
        temp.next = top;
        this.top = temp;
        System.out.println(data + " has been pushed successfully!");
    }

    public static boolean isEmpty() {
        return top == null;
    }

    public static int peek() {
        if(!isEmpty())
            return top.data;
        else {
            System.out.print("Stack is Empty");
            return -1;
        }
    }

    public static void pop() {

    }

    public static void main(String[] args) {

    }
}
