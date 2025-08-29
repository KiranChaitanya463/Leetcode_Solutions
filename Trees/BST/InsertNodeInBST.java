package Trees.BST;

import Trees.TreeNode;

//lc701

public class InsertNodeInBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        TreeNode cur=root;
        while(true){
            if(cur.val>val){
                if(cur.left==null){
                    cur.left=new TreeNode(val);
                    break;
                }
                cur=cur.left;
            }
            else{
                if(cur.right==null){
                    cur.right=new TreeNode(val);
                    break;
                }
                cur=cur.right;
            }
        }
        return root;
    }
}
