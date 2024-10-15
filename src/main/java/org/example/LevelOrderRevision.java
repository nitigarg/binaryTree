package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderRevision {
    public static void levelOrder(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);//this will tell us about levels
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            if(node==null){
                if(queue.isEmpty()){
                    return;
                }
                queue.add(null);
                System.out.println("null");
                continue;
            }
            System.out.print(node.val+"->");
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }

        }
    }

}
