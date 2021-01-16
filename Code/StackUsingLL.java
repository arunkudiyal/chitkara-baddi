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
        if(top == null) {
            System.out.println("STACK UNDERFLOW");
            System.exit(1);
        }
        System.out.println(top.data + " has been popped successfully!");
        top = top.next;
    }
    
    public static void display() {
        if(top == null) {
            System.out.println("STACK UNDERFLOW!");
            System.exit(1);
        } else {
                Node temp = top;
                while(temp != null) {
                System.out.println(temp.data + " ");
                System.out.println();
            }
        }    
    }    

    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);
        
        stack.display();
        stack.pop();
        stack.pop();
        
        System.out.println("The top-most element in the stack is: " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        
        stack.display();
        stack.pop();
    }
}
