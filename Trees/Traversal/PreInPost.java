package Trees.Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Trees.TreeNode;

public class PreInPost {

    public static void main(String[] args) {
        
    }
    public void pre_in_post(TreeNode root){
        if(root==null) return;
        List<Integer> pre=new ArrayList<>();
        List<Integer> in=new ArrayList<>();
        List<Integer> post=new ArrayList<>();
        Stack<Pair> st=new Stack<>();
        while(!st.isEmpty()){
            Pair it=st.pop();
            if(it.num==1){   // for the pre order 
                pre.add(it.node.val);
                it.num++;
                st.push(it);
                if(it.node.left!=null){
                    st.push(new Pair(it.node.left,1));
                }
            }
            else if(it.num==2){ // for in order
                in.add(it.node.val);
                it.num++;
                st.push(it);
                if(it.node.right!=null){
                    st.push(new Pair(it.node.right,1));
                }
            }
            else{ // for post order
                post.add(it.node.val);
            }
        }
        return;
    }
    
}
class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode node,int num){
        this.node=node;
        this.num=num;
    }
}
