package org.example;

public class InorderTraversal {

    /*this method is used for printing vlues in a tree inorder traversal
    * Left->value->right
    * */
    public static void inorderTraversal(TreeNode root){

        if(root==null){
            return;
        }
        //System.out.println(root.val+" -> ");
        inorderTraversal(root.left);
        System.out.print(root.val+" -> ");
        inorderTraversal(root.right);
    }

}
