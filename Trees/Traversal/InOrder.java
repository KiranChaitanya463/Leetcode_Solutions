package Trees.Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Trees.TreeNode;

public class InOrder {
    
}
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        //recursive
        // List<Integer> list=new ArrayList<>();
        // traverse(root,list);
        // return list;

        // itterative
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Stack<TreeNode> st=new Stack<>();
        TreeNode node=root;
        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }
            else{
                if(st.isEmpty()) break;
                node=st.pop();
                list.add(node.val);
                node=node.right;
            }
        }
        return list;
    }
    public void traverse(TreeNode node,List<Integer> list){
        if(node==null) return;
        traverse(node.left,list);
        list.add(node.val);
        traverse(node.right,list);
    }
}
