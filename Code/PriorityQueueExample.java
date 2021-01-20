package com.company;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(200);
        pq.add(100);
        pq.add(10);
        pq.add(20);
        pq.add(30);

        System.out.println(pq);     // [100, 10, 20, 30]

        // Find the element with the most priority -> peek()
        System.out.println("The element with the most priority is: " + pq.peek());

        // poll() -> remove the elemnt with the most priority
        System.out.println("The element removed is: " + pq.poll());

        // when you poll, the queue is again organized on the basis if it's priority
        System.out.println(pq);
    }
}
