package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {

    public static void leftView(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int level=queue.size();
            for(int i=0;i<level;i++){
                TreeNode node=queue.poll();
                if(i==0){
                    System.out.print(node.val+"->");
                }

                if(node.left!=null){
                    queue.add(node.left);
                }if(node.right!=null){
                    queue.add(node.right);
                }
            }

        }

    }


}
