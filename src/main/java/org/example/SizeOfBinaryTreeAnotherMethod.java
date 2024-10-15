package org.example;

public class SizeOfBinaryTreeAnotherMethod {

    public int size(TreeNode root){
        if(root==null){
            return 0;
        }
        return size(root.left)+size(root.right)+1;
    }

}
