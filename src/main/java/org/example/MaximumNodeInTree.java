package org.example;

public class MaximumNodeInTree {

    public static int findMax(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val,Math.max(findMax(root.left),findMax(root.right)));
    }

}
