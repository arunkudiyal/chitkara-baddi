package com.company;

public class MinHeap {

    int[] Heap;
    int size;
    int maxSize;

    // Constructor
    public MinHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        Heap = new int[this.maxSize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }

    public int parentNode(int index) {
        return index/2;
    }

    public int lefTNode(int index) {
        return index * 2;
    }

    public int rightNode(int index) {
        return index * 2 + 1;
    }

    public void swap(int index1, int index2) {
        int temp = Heap[index1];
        Heap[index1] = Heap[index2];
        Heap[index2] = temp;
    }

    public void insert(int data) {
        // if heap is not full
        if(size >= maxSize) {
            System.out.println("HEAP IS FULL");
            return;
        }
        // Put the data at the next empty position of the Heap
        Heap[++size] = data;

        int index = size;
        while(Heap[index] < Heap[parentNode(index)]) {
            swap(index, parentNode(index));
            index = parentNode(index);
        }
    }

    public boolean isLeafNode(int index) {
        if(index >= (size/2) && index <= size)
            return true;
        return false;
    }

    public void minHeapify(int index) {
        // if the node is not a leaf node, then proceed
        if(!isLeafNode(index)) {

            if(Heap[index] > Heap[lefTNode(index)] || Heap[index] > Heap[rightNode(index)]) {
                if(Heap[lefTNode(index)] < Heap[rightNode(index)]) {
                    swap(index, lefTNode(index));
                    minHeapify(lefTNode(index));
                }
                else {
                    swap(index, rightNode(index));
                    minHeapify(rightNode(index));
                }
            }
        }
    }

    public int remove() {
        // remove the smallest element
        int del = Heap[1];

        // Replace the Heap[1] with the last-most data
        Heap[1] = Heap[size--];
        minHeapify(1);

        return del;
    }

    public void display() {
        for(int i=1; i<= (size/2); i++) {
            System.out.print("Parent: " + Heap[i] +
            " Left Child: " + Heap[i * 2] +
            " Right Child: " + Heap[i * 2 + 1]);
            System.out.println();
        }
    }

    public void minHeap() {
        for(int i=(size/2); i >= 1; i--)
            minHeapify(i);
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);

        minHeap.insert(5);
        minHeap.insert(20);
        minHeap.insert(7);
        minHeap.insert(9);
        minHeap.insert(100);
        minHeap.insert(1);
        minHeap.minHeap();

        minHeap.display();

        System.out.println();
        minHeap.remove();
        minHeap.display();
    }
}
