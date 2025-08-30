package Trees.BST;

import Trees.TreeNode;

//lc108


// elements might be any order but must follow the BST rule
public class ConvertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==1) return new TreeNode(nums[0]);
        return create(nums,0,nums.length-1);
    }
    public TreeNode create(int[] nums, int start,int end){
        if(start>end) return null;
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=create(nums,start,mid-1);
        root.right=create(nums,mid+1,end);
        return root;
    }
}
