package com.company;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);


        System.out.println("the stack is: " + stack);

        System.out.println("The data popped is: " + stack.pop());
        System.out.println("the stack is: " + stack);

        System.out.println("the top most element in the stack is: " + stack.peek());

        int seachedElt = stack.search(30);
        System.out.println("the index of data 30 is: " + seachedElt);

        System.out.println("the size of the stack is: " + stack.size());
    }
}
