package Trees.Problems;

import java.util.List;

import Trees.TreeNode;

public class LeastCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // List<TreeNode> pPath=new ArrayList<>();
        // List<TreeNode> qPath=new ArrayList<>();


        // //path finding 
        // getPath(root,pPath,p);
        // getPath(root,qPath,q);

        // int n=Math.min(pPath.size(),qPath.size());
        // TreeNode result=new TreeNode();
        // for(int i=0;i<n;i++){
        //     if(pPath.get(i)==qPath.get(i)){
        //         result=pPath.get(i);
        //     }
        // }
        // return result;
        
        //base case
        if(root==null || root==p || root==q) return root;

        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);

        if(left==null) return right;
        else if (right ==null) return left;
        else return root;
    }

    public boolean getPath(TreeNode root, List<TreeNode> arr, TreeNode x) {
        // Base case: If the current
        // node is null, return false
        if (root == null) {
            return false;
        }

        // Add the current node's
        // value to the path list
        arr.add(root);

        // If the current node's value is equal
        // to the target value 'x', return true
        if (root == x) {
            return true;
        }

        // Recursively search for the target value
        // 'x' in the left and right subtrees
        if (getPath(root.left, arr, x) || getPath(root.right, arr, x)) {
            return true;
        }

        // If the target value 'x' is not found
        // in the current path, backtrack
        arr.remove(arr.size() - 1);
        return false;
    }
}
