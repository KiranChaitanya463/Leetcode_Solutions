package Trees.Problems;

import Trees.TreeNode;

//lc222
public class CountNodes {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null) return 1;
        // this approach takes a time of O(N) and space of O(H) and they are asking to take less than O(N)
        // return count(root);

        // this takes O(Log^2N)
        return findCount(root);

    }
    public int findCount(TreeNode root){
        int lh=leftHeight(root);
        int rh=rightHeight(root);
        if(lh==rh) return (int)Math.pow(2,lh)-1;
        return 1+findCount(root.left) + findCount(root.right);
    }
    public int leftHeight(TreeNode root){
        if(root==null) return 0;
        return 1 + leftHeight(root.left);
    }
    public int rightHeight(TreeNode root){
        if(root==null) return 0;
        return 1 + rightHeight(root.right);
    }
    public int count(TreeNode root){
        if(root==null) return 0;
        return 1 + count(root.left) + count(root.right);
    }
}
