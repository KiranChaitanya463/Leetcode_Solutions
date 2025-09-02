package Trees.BST;
import java.util.ArrayList;
import java.util.List;

import Trees.TreeNode;

// this might be the brute approach check the notes for explanation of optimal and striver viedo for code
// lc653

public class TwoSumBST {
     public boolean findTarget(TreeNode root, int k) {
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        int i=0;
        int j=list.size()-1;
        while(i<j){
            int sum=list.get(i)+list.get(j);
            if(sum==k){
                return true;
            }
            else if(sum>k){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
    public void inorder(TreeNode root, List<Integer> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}
