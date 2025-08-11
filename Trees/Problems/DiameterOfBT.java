package Trees.Problems;

import Trees.TreeNode;

public class DiameterOfBT {
    // its like finding the longest path between two nodes in the binary tree
    // for the brute its like for everynode we find the left longest depth and right longest depth and tracking max
    // for the optimal its like just modifying the max depth by tracking the max depth 
    
}
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter= new int[1];
        height(root,diameter);
        return diameter[0];
    }
    public int height(TreeNode root, int[] diameter){
        if(root==null) return 0;
        int lh=height(root.left,diameter);
        int rh=height(root.right,diameter);
        diameter[0]=Math.max(diameter[0],lh+rh); // additional line to track the max while finding the max depth
        return 1+Math.max(lh,rh);
    }
}
