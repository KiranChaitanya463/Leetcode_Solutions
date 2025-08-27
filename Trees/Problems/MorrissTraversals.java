package Trees.Problems;

import java.util.ArrayList;
import java.util.List;

import Trees.TreeNode;

public class MorrissTraversals {
    // The morris traversal can be used to traverse for the inorder or preorder without taking any extra space
    // unlike the itterative or recursive O(N) space. 

     public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder=new ArrayList<>();
        TreeNode cur=root;
        while(cur!=null){
            if(cur.left==null){
                preorder.add(cur.val);
                cur=cur.right;
            }
            else{
                TreeNode temp=cur.left;
                while(temp.right!=null && temp.right!=cur){
                    temp=temp.right;
                }
                if(temp.right==null){
                    preorder.add(cur.val);
                    temp.right=cur;
                    cur=cur.left;
                }
                else{
                    temp.right=null;
                    cur=cur.right;
                }
            }
        }
        return preorder;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder=new ArrayList<>();
        TreeNode cur=root;
        while(cur!=null){
            if(cur.left==null){
                inorder.add(cur.val);
                cur=cur.right;
            }
            else{
                TreeNode temp=cur.left;
                while(temp.right!=null && temp.right!=cur){
                    temp=temp.right;
                }
                if(temp.right==null){
                    inorder.add(cur.val);
                    temp.right=cur;
                    cur=cur.left;
                }
                else{
                    temp.right=null;
                    cur=cur.right;
                }
            }
        }
        return inorder;
    }
}
