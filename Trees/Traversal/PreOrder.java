package Trees.Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Trees.TreeNode;

public class PreOrder{

    public List<Integer> preorderTraversal(TreeNode root) {

        // recursive
        // List<Integer> list=new ArrayList<>();
        // traverse(root,list);
        // return list;

        // itterative
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            // like add root see if right exists and then push and then left exists then push left and for next itteration it will be considered as root.
            list.add(root.val);
            if(root.right!=null) st.push(root.right);
            if(root.left!=null) st.push(root.left);
        }
        return list;
    }
    public void traverse(TreeNode node,List<Integer> list){
        if(node==null) return;
        list.add(node.val);
        traverse(node.left,list);
        traverse(node.right,list);
    }
}