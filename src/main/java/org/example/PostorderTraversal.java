package org.example;

public class PostorderTraversal {

    public static void postorderTraversal(TreeNode root){
        if(root==null){
            return ;

        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.val +" -> ");
    }
}
