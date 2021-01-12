package com.company;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int arr[], int low, int high, int option) {

        if(low == high) {
            if(arr[low] == option)
                return low;
        }

        if(high > low) {
            int mid = (low + high) / 2;
            // BAse Condition
            if(arr[mid] == option)
                return mid;
            if(arr[mid] > option)   // LEFT
                return binarySearch(arr, 0, mid-1, option);
            if(arr[mid] < option)   // RIGHT
                return binarySearch(arr, mid+1, high, option);
        }
        return  -1;
    }

    public static void main(String[] args) {
        int arr[], size;
        System.out.print("Enter thE size of the data set: ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        // Create the array of the same size
        arr = new int[size];

        // input the elements
        System.out.print("Enter the values: ");
        for(int i=0; i<size; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter the data that you are looking for: ");
        int option = sc.nextInt();

        int answer = binarySearch(arr, 0, arr.length-1, option);

        if(answer != -1) {
            System.out.println("The element" + option  + " is available in the data set at position " + answer);
        } else {
            System.out.println("The element " + option + " is NOT available in the data set");
        }
    }
}
