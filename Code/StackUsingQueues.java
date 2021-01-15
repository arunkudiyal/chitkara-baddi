package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int current_size;

        // Constructor
        Stack() {
            current_size = 0;
        }

        // push() -> enQueue()
        public void push(int data) {
            q1.add(data);
            current_size += 1;
            System.out.println(data + " has been pushed successfully!");
        }

        // pop()
        public void pop() {
            if(q1.isEmpty()) {
                System.out.println("Stack Is Empty");
            }
            // remove all elts from q1 to q2 until there is
            // only one let left in q1
            while(q1.size() != 1) {
                q2.add(q1.peek());
                q1.remove();
            }
            // Last element is remaining
            int dataPopped = q1.remove();
            System.out.println(dataPopped + " has been popped from the stack!");
            current_size -= 1;

            // Swap the names of the queues
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        public int size() {
            return this.current_size;
        }

        public int peek() {
            if(q1.isEmpty())
                return -1;

            while(q1.size() != 1) {
                q2.add(q1.peek());
                q1.remove();
            }

            int top = q1.remove();
            q2.add(top);

            // Swap the names of the queues
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return top;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);

        stack.pop();
        stack.pop();

        System.out.println("The size of the stack is: " + stack.size());

        System.out.println("the top most element is: " + stack.peek());

    }
}
