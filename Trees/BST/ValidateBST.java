package Trees.BST;

import Trees.TreeNode;


//lc98

// by maintaining a range we can check wherether they exist in that range or not.
public class ValidateBST{
    public boolean isValidBST(TreeNode root) {
        return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean valid(TreeNode root,long low,long high){
        if(root==null) return true;
        if(low>=root.val || root.val>=high) return false;
        return valid(root.left,low,root.val) && valid(root.right,root.val,high);
    }
}