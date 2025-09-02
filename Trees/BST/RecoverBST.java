package Trees.BST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Trees.TreeNode;


// this might be the brute approach check the notes for explanation of optimal and striver viedo for code
// lc99

public class RecoverBST {
    public void recoverTree(TreeNode root) {
        List<Integer> in=new ArrayList<>();
        inorder(root,in);
        Collections.sort(in);
        int[] index=new int[]{0};
        recover(root,in,index);
    }
    public void recover(TreeNode root, List<Integer> in,int[] index){
        if(root==null) return;
        recover(root.left,in,index);
        root.val=in.get(index[0]++);
        recover(root.right,in,index);
    }
    public void inorder(TreeNode root, List<Integer> in){
        if(root==null) return;
        inorder(root.left,in);
        in.add(root.val);
        inorder(root.right,in);
    }
}
