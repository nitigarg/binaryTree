package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewOfBinaryTree {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer>result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int level=q.size();
            for(int i=0 ;i<level;i++){
                TreeNode node=q.poll();
                //adding last node of level which is nothing but rightmost node
                if(i==level-1){
                    result.add(node.val);
                }
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
        }
        return result;
    }
}
