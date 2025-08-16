package Trees.Problems;

import java.util.List;

import Trees.TreeNode;

public class SymmetricOrNot{

}
class Solution {
    public boolean isSymmetric(TreeNode root) {

        
        // List<Integer> left=new ArrayList<>();
        // List<Integer> right=new ArrayList<>();
        // left.add(root.val);
        // right.add(root.val);
        // leftPreOrder(root.left,left);
        // rightPreOrder(root.right,right);
        // return left.equals(right);

        // optimal
        return root==null || isSym(root.left,root.right);
    }
    public boolean isSym(TreeNode left, TreeNode right){
        if(left==null || right==null){
            return left==right;
        }
        if(left.val!=right.val) return false;
        return isSym(left.left, right.right) && isSym(left.right , right.left);
    }
    public void leftPreOrder(TreeNode root,List<Integer> left){
        if(root==null){
            left.add(-1);
            return;
        } 
        left.add(root.val);
        leftPreOrder(root.left,left);
        leftPreOrder(root.right,left);
    }
    public void rightPreOrder(TreeNode root,List<Integer> right){
        if(root==null){
            right.add(-1);
            return;
        } 
        right.add(root.val);
        rightPreOrder(root.right,right);
        rightPreOrder(root.left,right);
    }
}