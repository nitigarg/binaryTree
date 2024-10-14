package org.example;

public class PreOrderTraversal {
    /*value->left->right*/
    public static void preorderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" -> ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

}
