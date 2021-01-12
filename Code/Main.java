package com.company;

public class Main {

    public static void reduceByOne(int n) {
        // Base Condition -> which tells recursive code where to stop
        if(n >= 0)
            reduceByOne(n-1);
        System.out.println("Call Completion: " + n);
    }

    public static void sayHello() {
        System.out.println("Hello");
        sayHello();
    }

    public static void main(String[] args) {
        // reduceByOne(10);
        sayHello();
    }
}
