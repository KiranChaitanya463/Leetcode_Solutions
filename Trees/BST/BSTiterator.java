package Trees.BST;

import java.util.Stack;

import Trees.TreeNode;


//lc173

public class BSTiterator {
    Stack<TreeNode> st=new Stack<>();
    public BSTiterator(TreeNode root) {
        pushAll(root);
    }
    
    public int next() {
        TreeNode tempNode=st.pop();
        pushAll(tempNode.right);
        return tempNode.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
    public void pushAll(TreeNode root){
        while(root!=null){
            st.push(root);
            root=root.left;
        }
    }
}
