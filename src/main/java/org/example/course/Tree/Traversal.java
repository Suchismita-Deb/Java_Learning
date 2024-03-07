package org.example.course.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
    private static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;
        public TreeNode(int data){
            this.data = data;
        }
    }
    public static void preOrderTraversal(TreeNode root){
        if(root==null) return;
        System.out.print(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void postOrderTraversal(TreeNode root){
        if(root==null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data);
    }

    public static void inOrderTraversal(TreeNode root){
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data);
        inOrderTraversal(root.right);
    }

    public static void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return;
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.peek();
            if(temp.left!=null) queue.add(temp.left);
            if(temp.right!=null) queue.add(temp.right);
            System.out.print(temp.data);
            queue.poll();
        }
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        /* 1
         2    3
        4  5
        */
        System.out.println("PreOrder Traversal");
        preOrderTraversal(root);
        System.out.println("\nPostOrder Traversal");
        postOrderTraversal(root);
        System.out.println("\nInOrder Traversal");
        inOrderTraversal(root);
        System.out.println("\nLevelOrder Traversal");
        levelOrderTraversal(root);
    }
}
