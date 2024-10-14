package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void levelorderTraversal(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            System.out.print(node.val+" -> ");
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
    }


}
