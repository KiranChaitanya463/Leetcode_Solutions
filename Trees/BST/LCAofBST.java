package Trees.BST;

import Trees.TreeNode;

public class LCAofBST{
     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return find(root,p,q);

        // this approach would be useful if it is BT and it takes O(N) but in this case BST so no need of O(N) the above method would do.
        
        // if(root==null || root==p || root==q){
        //     return root;
        // }
        // TreeNode left=lowestCommonAncestor(root.left,p,q);
        // TreeNode right=lowestCommonAncestor(root.right,p,q);
        // if(left==null) return right;
        // else if(right==null) return left;
        // else return root;
    }

    // Three conditions
    // -> if the elements less than current node we go left
    // -> if the elements greater than current we go right
    // -> if one element less and one is greater that means its the meeting node and its the first one we encountered.
    public TreeNode find(TreeNode root,TreeNode p, TreeNode q){
        if(root==null) return root;
        int cur=root.val;
        if(cur>p.val && cur>q.val)
            return find(root.left,p,q);
        else if(cur<p.val && cur<q.val)
            return find(root.right,p,q);
        else
            return root;
    }
}