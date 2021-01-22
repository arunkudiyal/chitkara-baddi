package com.company;

import java.util.Scanner;

public class DijkstraAlgorithm {

    public static int minimumDistance(int[] distance, boolean[] visited) {
        // find out the smallest of the non visited node

        int minVertex = -1;
        for(int i=0; i<distance.length; i++) {
            if(!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex]) ) {
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static void dijkastra(int[][] adjacencyMatrix) {
        int v = adjacencyMatrix.length;
        boolean visited[] = new boolean[v];
        int distance[] = new int[v];

        distance[0] = 0;
        for(int i=1; i<v; i++)
            distance[i] = Integer.MAX_VALUE;


        for(int i=1; i<v; i++) {
            // Find the minimum distance vertex
            int minimumVertex = minimumDistance(distance, visited);
            visited[minimumVertex] = true;

            // Explore the neighbors
            for(int j=0; j<v; j++) {
                // Check if there exist an edge between the minimum vertex & the current vertex
                // Also, that node should not be visisted

                if(adjacencyMatrix[minimumVertex][j] != 0 && !visited[j] && distance[minimumVertex] != Integer.MIN_VALUE) {
                    // check if the diatance via minimumVertex is smaller
                    int newDistance = distance[minimumVertex] + adjacencyMatrix[minimumVertex][j];

                    if(newDistance < distance[j])
                        distance[j] = newDistance;
                }
            }
        }

        // print the vertex, and minimumDistance
        for(int i=0; i<v; i++)
            System.out.println(i + " " + distance[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int e = sc.nextInt();
        int adjacencyMatrix[][] = new int[v][v];
        for(int i=0; i<e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            adjacencyMatrix[v1][v2] = weight;
            adjacencyMatrix[v2][v1] = weight;
        }

        dijkastra(adjacencyMatrix);
    }
}
