package org.example;

/*
 * "height" refers to the maximum number of edges from the root node to
 * the furthest leaf node (the longest path), while "depth" refers to the number
 * of edges from the root node to a specific node within the tree;
 * essentially, the height is the maximum depth of any node in the tree. */
public class HeightOfTree {

    int height(TreeNode root){
        //base condition
        if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }

}
