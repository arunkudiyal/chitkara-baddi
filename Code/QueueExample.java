package com.company;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        // Queue is an interface who's body is provided by LinkedList Class
        Queue<Integer> queue = new LinkedList<>();

        // Insert some elements
        // Operation - enQueue()
        queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);
        queue.add(500);


        System.out.println("The Queue is: " + queue);
        // Peek the head (start) of the Queue
        System.out.println(queue.peek());

        // Operation - deQueue
        System.out.println("Data removed is: " + queue.remove());
        System.out.println("Data removed is: " + queue.remove());
        System.out.println("The Queue is: " + queue);
        System.out.println(queue.peek());

        // Size of the queue
        System.out.println("The size of the Queue is : " + queue.size());
    }
}
