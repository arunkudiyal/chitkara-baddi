package com.company;

public class BinarySearchTree {

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Top-most element
    Node root;

    BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertKey(root, data);
    }

    public void inOrder() {
        inOrderTraversal(this.root);
    }

    public void preOrder() {
        preOrderTraversal(this.root);
    }

    public boolean search(int data) {
        if(searchKey(root, data))
            return true;
        else
            return false;
    }

    public boolean searchKey(Node root, int key) {

        while(root != null) {
            if (key > root.data)
                root = root.right;

            else if (key < root.data)
                root = root.left;

            else
                return true;
        }
        return false;
    }

    public Node insertKey(Node root, int key) {
        // tree is empty
        if(root == null) {
            root = new Node(key);
            return root;
        }

        // if the tree exists
        if(key < root.data)
            root.left = insertKey(root.left, key);
        else if(key > root.data)
            root.right = insertKey(root.right, key);

        return root;
    }

    public void delete(int data) {
        root = deleteKey(root, data);
    }

    public int minValue(Node root) {
        int min = root.data;
        while(root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    public Node deleteKey(Node root, int key) {
        // Base condition
        if(root == null)
            return null;

        // Search for the element
        if(key < root.data)
            root.left = deleteKey(root.left, key);
        else if(key > root.data)
            root.right = deleteKey(root.right, key);

        else {
            // case 1: Leaf Node
            if(root.left == null && root.right == null) {
                root = null;
                return root;
            }

            // Case 2: Node contains 1 child
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;

            // case 3: Node contains 2 children
            root.data = minValue(root.right);
            root.right = deleteKey(root.right, root.data);
        }
        return root;
    }

    public void preOrderTraversal(Node root) {
        if(root == null)
            return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void inOrderTraversal(Node root) {
        if(root == null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(300);
        bst.insert(100);
        bst.insert(200);
        bst.insert(600);
        bst.insert(550);
        bst.insert(700);

        System.out.println("in-Order of the BST is: ");
        bst.inOrder();
        System.out.println();

        bst.delete(300);

        System.out.println("in-Order of the BST is: ");
        bst.inOrder();
        System.out.println();

    }
}
