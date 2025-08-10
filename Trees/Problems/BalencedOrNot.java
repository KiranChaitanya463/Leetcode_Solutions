package Trees.Problems;


import Trees.TreeNode;

public class BalencedOrNot {
    
}
class Solution {
    public boolean isBalanced(TreeNode root) {
        return check(root)!=-1;
    }
    public int check(TreeNode root){
        if(root==null) return 0;
        int lh=check(root.left);
        int rh=check(root.right);
        if(lh==-1 || rh ==-1) return -1; // additional two conditions with the 
        if(Math.abs(lh-rh)>1) return -1; // maxdepth problem
        return 1 + Math.max(lh,rh);
    }
}
