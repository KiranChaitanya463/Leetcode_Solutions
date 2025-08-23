package Trees.Problems;

import Trees.TreeNode;

//lc222
public class CountNodes {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null) return 1;
        return count(root);
    }
    public int count(TreeNode root){
        if(root==null) return 0;
        return 1 + count(root.left) + count(root.right);
    }
}
