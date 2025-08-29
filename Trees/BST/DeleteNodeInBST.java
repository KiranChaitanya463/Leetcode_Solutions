package Trees.BST;

import Trees.TreeNode;

//lc450

public class DeleteNodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(root.val==key){
            return helper(root);
        }
        TreeNode cur=root;
        while(cur!=null){
            if(cur.val>key){
                if(cur.left!=null && cur.left.val==key){
                    cur.left=helper(cur.left); // here we are changing the pointer  which eventually deletes the node.
                    break;
                }
                cur=cur.left;
            }
            else{
                if(cur.right!=null && cur.right.val==key){
                    cur.right=helper(cur.right); // here 
                    break;
                }
                cur=cur.right;
            }
        }
        return root;
    }
    public TreeNode helper(TreeNode root){
        if(root.left==null) return root.right;
        if(root.right==null) return root.left;
        TreeNode rightChild=root.right;
        TreeNode lastRightChild=findLast(root.left);
        lastRightChild.right=rightChild;
        return root.left;
    }
    public TreeNode findLast(TreeNode root){
        if(root.right==null) return root;
        return findLast(root.right);
    }
}
