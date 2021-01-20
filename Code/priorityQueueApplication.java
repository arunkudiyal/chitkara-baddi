package com.company;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueueApplication {

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student student) {
            if(this.rank < student.rank)
                return -1;
            else if(this.rank > student.rank)
                return 1;
            else return 0;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", rank=" + rank +
                    '}';
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("Steve", 5));
        pq.add(new Student("John", 2));
        pq.add(new Student("Tim", 1));
        pq.add(new Student("Ben", 3));
        pq.add(new Student("Adam", 4));

        // iterator
        Iterator<Student> itr = pq.iterator();
        while(itr.hasNext())
            System.out.println("The item of the queue are: " + pq.poll().toString());
    }
}
