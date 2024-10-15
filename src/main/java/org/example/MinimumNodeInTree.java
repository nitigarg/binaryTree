package org.example;

public class MinimumNodeInTree {
    public static int findMin(TreeNode root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val,Math.min(findMin(root.left),findMin(root.right)));
    }

}
