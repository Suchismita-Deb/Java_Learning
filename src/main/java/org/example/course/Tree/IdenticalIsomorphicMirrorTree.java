package org.example.course.Tree;

public class IdenticalIsomorphicMirrorTree {
    private static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public static boolean identicalTree(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        if(root1.data == root2.data){
            if(identicalTree(root1.left,root2.left)){
                if(identicalTree(root1.right,root2.right)){
                    return true;
                }
            }
        }
        return false;
    }
    // TODO:
    public static boolean isomorphicTree(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        if(root1.data != root2.data)
            return false;
        if(root1.data == root2.data)
            return true;
        return isomorphicTree(root1.left, root2.right) && isomorphicTree(root1.right,root2.left);
    }

    // TODO:
    public static int leftSum(TreeNode root,int count){
        if(root==null) return 0;
        if(root.left!=null){
            count+=root.left.data;
        }
        leftSum(root.left,count);
        leftSum(root.right,count);
        return count;
    }

    public static int leftLeaves(TreeNode root,int count){
        if(root==null) return 0;
        if(root.left!=null){
            if(root.left.left==null && root.left.right==null){
                count+=root.left.data;
                return count;
            }
        }
        return leftLeaves(root.left,count) + leftLeaves(root.right,count);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);

        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(3);
        node.right = new TreeNode(5);
        node.left.left = new TreeNode(9);
        node.left.right = new TreeNode(79);

        System.out.println(identicalTree(root,node));
        System.out.println(isomorphicTree(root,node));
        System.out.println(leftSum(root,0));
        System.out.println(leftLeaves(root,0));
    }
}
