package Trees.Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Trees.TreeNode;

public class PostOrder {
    
}

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {

        // recursive
        // List<Integer> list=new ArrayList<>();
        // traverse(root,list);
        // return list;

        //itterative - using 2 stack
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        TreeNode node=root;
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();

        st1.push(node);
        while(!st1.isEmpty()){
            node=st1.pop();
            st2.push(node);
            if(node.left!=null) st1.push(node.left);
            if(node.right!=null) st1.push(node.right);
        }
        while(!st2.isEmpty()){
            list.add(st2.pop().val);
        }
        return list;
    }
    public void traverse(TreeNode node,List<Integer> list){
        if(node==null) return;
        traverse(node.left,list);
        traverse(node.right,list);
        list.add(node.val);
    }
}
