package com.company;

import java.util.Scanner;

public class LongestIncreasingSubsequence {

    public static int calculateLIS(int[] input, int n) {
        // For memoization
        int[] output = new int[n];
        output[0] = 1;

        for(int i=1; i<n; i++) {
            output[i] = 1;
            // traverse the input array in Reverse and check for a better solution
            for(int j=i-1; j>=0; j--) {
                if(input[j] > input[i])
                    continue;
                int possibleAnswer = output[j] + 1;
                if(possibleAnswer > output[i])
                    output[i] = possibleAnswer;
            }
        }
        // Longest subsequence in the output array
        int best = 0;
        for(int i=0; i<n; i++) {
            if(best < output[i])
                best = output[i];
        }
        return best;
    }

    public static void main(String[] args) {
        int arr[]; int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();

        arr = new int[n];

        System.out.print("Enter teh data: ");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        int result = calculateLIS(arr, n);
        System.out.println("The LIS is: " + result);
    }
}
