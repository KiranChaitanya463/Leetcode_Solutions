package Trees.Problems;

import Trees.TreeNode;

//lc404
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        return sum(root,false);
    }
    public int sum(TreeNode root,boolean isLeft){
        if(root==null) return 0;
        if(root.left==null && root.right==null){
            if(isLeft) return root.val;
        }
        return sum(root.left,true) + sum(root.right, false);
    }
}
