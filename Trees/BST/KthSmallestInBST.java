package Trees.BST;

import java.util.ArrayList;
import java.util.List;

import Trees.TreeNode;

//lc230


// the inorder of any BST will be the sorted order so get the sorted elements and get the k-1 element.
public class KthSmallestInBST {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list=new ArrayList<>();
        traverse(root,list,k);
        return list.get(k-1);
    }
    public void traverse(TreeNode root, List<Integer> list,int k){
        if(root==null) return;
        traverse(root.left,list,k);
        list.add(root.val);
        if(list.size()==k) return;
        traverse(root.right,list,k);
    }
}
