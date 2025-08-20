package Trees.Problems;

import Trees.TreeNode;

public class PathSum {

    // while traversing through nodes we maintain a sum and when we hit a leaf node we check if targetsum ==sum if yes we return.
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return path(root,targetSum,0);
    }
    public boolean path(TreeNode root, int target, int sum){
        if(root!=null){
            sum+=root.val;
        }
        else return false;
        if(root.left==null && root.right==null){
            if(sum==target){
                return true;
            }
            else{
                return false;
            }
        }
        boolean left= path(root.left,target,sum);
        boolean right=path(root.right,target,sum); 
        if(left || right){
            return true;
        }
        else{
            return false;
        }
    }
}