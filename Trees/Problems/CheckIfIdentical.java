package Trees.Problems;

import Trees.TreeNode;

public class CheckIfIdentical {
    // we can find the two trees are identical or not by doing the traversal on both the trees at same time at any point the condition false or the values not equal the return false
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null){
            return (p==q);
        }
        return (p.val==q.val) &&
                isSameTree(p.left,q.left) &&
                isSameTree(p.right,q.right);
    }
}
