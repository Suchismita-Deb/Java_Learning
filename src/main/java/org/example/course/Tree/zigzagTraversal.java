package org.example.course.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class zigzagTraversal {
    private static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data = data;
        }
    }
    public static void zigzag(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return;
        q.add(root);
        TreeNode temp = new TreeNode(-1);
        q.add(temp);
        int count=0;
        while(!q.isEmpty()){
            if(q.peek()==temp){
                count++;
            }
            TreeNode node = q.peek();
            if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);
            q.poll();
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
    }
}
