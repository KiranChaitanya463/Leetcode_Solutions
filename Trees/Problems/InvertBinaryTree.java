package Trees.Problems;
import Trees.TreeNode;


//lc226
public class InvertBinaryTree {

    // so exchanging the node references while traversing 
    // so when the exchange happen the below subtree will also go with not just that node (cause i stuck with that question for about 20 min)
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;

        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
