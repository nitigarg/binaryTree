package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(8);
        root.right=new TreeNode(15);
        TreeNode leftNode=root.left;
        TreeNode rightNode= root.right;
        leftNode.left=new TreeNode(28);
        rightNode.left=new TreeNode(27);
        rightNode.right=new TreeNode(30);
        //System.out.println("root node is " + root.val);
        //System.out.println("bottom most left left node is "+leftNode.left.val);

        System.out.println("Inorder Traversal left->value->right");
        InorderTraversal.inorderTraversal(root);
        System.out.println();
        System.out.println("PreOrder traversal value->left->right");
        PreOrderTraversal.preorderTraversal(root);
        System.out.println();
        System.out.println("PostOrder traversal left->right->value");
        PostorderTraversal.postorderTraversal(root);
        System.out.println();
        System.out.println("LevelOrder traversal");
        LevelOrderTraversal.levelorderTraversal(root);
        SizeOfBinaryTree ob=new SizeOfBinaryTree();
        System.out.println();
        int size=ob.size(root);
        System.out.println("size of given tree is "+size);
    }
}