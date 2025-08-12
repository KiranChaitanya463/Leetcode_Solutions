package Trees.Problems;

import Trees.TreeNode;

public class MaxPathSum {
    // we have to find the maximum sum path no need to return the path but track the max sum
    // the tree might also contains the negative value nodes
    // while traversing we track the max value and if at any point the sum gets negative we consider that as zero
    // once got through the code and dry run then will understand.
}
class Solution {
    public int maxPathSum(TreeNode root) {
        int[] maxValue=new int[1];
        maxValue[0]=Integer.MIN_VALUE;
        maxi(root,maxValue);
        return maxValue[0];
    }
    public int maxi(TreeNode node,int[] maxValue){
        if(node==null) return 0;
        int left=Math.max(0,maxi(node.left,maxValue));
        int right=Math.max(0,maxi(node.right,maxValue));
        maxValue[0]=Math.max(maxValue[0],left+right+node.val);
        return Math.max(left,right)+node.val;
    }
}
