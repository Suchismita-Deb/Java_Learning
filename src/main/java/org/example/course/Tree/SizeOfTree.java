package org.example.course.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfTree {
    private static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data = data;
        }
    }
    public static int sizeTree(TreeNode root){
        if (root==null) return 0;
        int l = sizeTree(root.left);
        int r = sizeTree(root.right);
        return 1+l+r;
    }
    public static int heightTree(TreeNode root){
        if(root==null) return 0;
        int l = heightTree(root.left);
        int r = heightTree(root.right);
        return Math.max(l,r) + 1;
    }
    public static int sumTree(TreeNode root){
        if(root==null){
            return 0;
        }
        int l = sumTree(root.left);
        int r = sumTree(root.right);
        root.data = l+r+ root.data;
        return root.data;

    }
    public static void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return;
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.peek();
            if(temp.left!=null) queue.add(temp.left);
            if(temp.right!=null) queue.add(temp.right);
            System.out.print(temp.data+" ");
            queue.poll();
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(7);
        System.out.println(sizeTree(root));
        System.out.println(heightTree(root));
        sumTree(root);
        levelOrderTraversal(root);
    }
}
