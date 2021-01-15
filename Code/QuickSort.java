package com.company;

import java.util.Scanner;

public class QuickSort {

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pi = start;

        for(int i=start; i<end; i++) {
            if(arr[i] <= pivot) {
                // swap(arr[i], pi)
                int temp = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp;

                pi++;
            }
        }
        // swap(pi, pivot)
        int temp = arr[pi];
        arr[pi] = arr[end];
        arr[end] = temp;

        return pi;
    }

    public static void quickSort(int[] arr, int start, int end) {
        if(start < end) {
            int pi = partition(arr, start, end);
            quickSort(arr, start, pi-1);
            quickSort(arr, pi+1, end);
        }
    }

    public static void printData(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[], size;
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        arr = new int[size];

        System.out.print("Enter the values of the data set: ");
        for(int i=0; i<size; i++)
            arr[i] = sc.nextInt();

        System.out.print("The data before sorting is: ");
        printData(arr);

        quickSort(arr, 0, arr.length-1);

        System.out.print("The data after sorting is: ");
        printData(arr);
    }
}
