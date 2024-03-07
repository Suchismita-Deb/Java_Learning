package org.example.course.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOfNode {
    private static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;
        public TreeNode(int data){
            this.data = data;
        }
    }
    public static int levelOfNode(TreeNode root, int level, int val){
        if(root == null) return -1;
        if(root.data==val) return level;
        int l = levelOfNode(root.left,level+1,val);
        if(l!=-1) return l;
        int r = levelOfNode(root.right,level+1,val);
        if(r!=-1) return r;
        return r;
    }
    public static int levelOfNodeLevelOrder(TreeNode root, int val){
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return -1;
        queue.add(root);
        TreeNode dummy = new TreeNode(-1);
        int level = 0;
        while(!queue.isEmpty()){
            TreeNode temp = queue.peek();
            if(temp.data==val) return level;
            if(temp==dummy) {
                level++;
                queue.poll();
                if(!queue.isEmpty())
                queue.add(dummy);
            }

            if(temp.left!=null) queue.add(root.left);
            if(temp.right!=null) queue.add(root.right);
            queue.poll();
        }
        return -1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(7);
        System.out.println(levelOfNode(root,0,7));
        System.out.println(levelOfNodeLevelOrder(root,7));
    }
}
