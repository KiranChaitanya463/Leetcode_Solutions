package Trees.BST;

import Trees.TreeNode;


//lc700
public class SearchInBST{
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        return search(root,val);
    }
    public TreeNode search(TreeNode root, int val){
        if(root.val==val) return root;
        if(root.val>val && root.left!=null) return search(root.left,val);
        else if(root.val<val && root.right!=null) return search(root.right,val);
        return null;
    }
}