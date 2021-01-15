package com.company;

import java.util.ArrayList;
import java.util.List;

public class StackUsingArrayList {

    private static List<String> list = new ArrayList<>();

    public String toString() {
        return "Stack: [elements=" + list + "]";
    }

    public static boolean isEmpty() {
        return list.isEmpty();
    }

    public static void push(String element) {
        list.add(element);
    }

    public static String pop() {
        if(list.isEmpty()) {
            System.out.println("Stack Underflow!");
            return null;
        }
        String top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    public static String peek() {
        String top = list.get(list.size() - 1);
        return top;
    }

    public static void main(String[] args) {
        StackUsingArrayList stack = new StackUsingArrayList();

        stack.push("Hello");
        stack.push("how");
        stack.push("are");
        stack.push("you?");

        System.out.println(stack.toString());

        stack.pop();
        stack.pop();

        System.out.println(stack.toString());

        stack.pop();
        stack.pop();
        System.out.println(stack.toString());

        stack.pop();
    }
}
