package org.example;

/*Size of tree is total number of nodes in a tree*/
public class SizeOfBinaryTree {
    int count=0;
    public int size(TreeNode root){

        if(root==null){
            return 0;
        }
        size(root.left);
        count++;
        size(root.right);
        return count;
    }

}
