package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    static class Node {
        int data;
        Node left, right;
        // Constructor
        Node(int data) {
            this.data = data;
            this.left = right = null;
        }
    }

    // root Node -> start of the Tree
    Node root;

    // when the Binary tree is created, root is at null
    BinaryTree() {
        this.root = null;
    }

    public void inOrder() {
        inOrderTraversal(this.root);
    }

    public void preOrder() {
        preOrderTraversal(this.root);
    }

    public void postOrder() {
        postOrderTraversal(this.root);
    }

    public void inOrderTraversal(Node root) {
        if(root == null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public void preOrderTraversal(Node root) {
        if(root == null)
            return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal(Node root) {
        if(root == null)
            return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        int n1 = q.size();
        

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(100);
        tree.root.left = new Node(200);
        tree.root.right = new Node(300);
        tree.root.left.left = new Node(400);
        tree.root.left.right = new Node(500);
        tree.root.right.left = new Node(600);

        System.out.println("The in-Order traversal is: ");
        tree.inOrder();
        System.out.println();

        System.out.println("The pre-Order traversal is: ");
        tree.preOrder();
        System.out.println();

        System.out.println("The post-Order traversal is: ");
        tree.postOrder();
        System.out.println();
    }
}
