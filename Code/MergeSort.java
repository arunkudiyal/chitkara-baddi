package com.company;

import java.util.Scanner;

public class MergeSort {

    public static void merge(int arr[], int left, int mid, int right) {

        // Find the sizes
        int n1 = (mid - left) + 1;
        int n2 = right - mid;

        // Create the temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy the data
        for(int i=0; i<n1; i++)
            L[i] = arr[left + i];
        for(int i=0; i<n2; i++)
            R[i] = arr[(mid+1) + i] ;

        // MERGE

        // initial indices
        int i=0; int j=0;
        int k = left;

        while(i<n1 && j<n2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // Copy the remaining data
        while(i < n1) {
            arr[k] = L[i];
            i++; k++;
        }
        while(j < n2) {
            arr[k] = R[j];
            j++; k++;
        }
    }

    public static void mergeSort(int arr[], int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;

            // Sort the left and right data
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);

            merge(arr, start, mid, end);
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

        mergeSort(arr, 0, arr.length-1);

        System.out.print("The data after sorting is: ");
        printData(arr);

    }

}
