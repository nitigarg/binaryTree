package org.example;

public class DiameterOfBinaryTree {
    int diameter = 0;
    public int findDiameter(TreeNode root) {
        height(root);
        return diameter;
    }
    private int height (TreeNode root){
        if (root == null) {
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        diameter=Math.max(diameter,leftHeight+rightHeight);
        return 1+Math.max(leftHeight,rightHeight);
    }
}
