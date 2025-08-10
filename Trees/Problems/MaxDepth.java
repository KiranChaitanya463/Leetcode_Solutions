package Trees.Problems;


import Trees.TreeNode;

public class MaxDepth {
    
}
class Solution {
    public int maxDepth(TreeNode root) {

        // using recursive
        if(root==null) return 0;
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);
        return 1 + Math.max(lh,rh);


        // using level order traversal
        // Queue<TreeNode> queue=new LinkedList<TreeNode>();
        // int count=0;
        // if(root==null) return count;
        // queue.offer(root);
        // while(!queue.isEmpty()){
        //     int levelNum=queue.size();
        //     for(int i=0;i<levelNum;i++){
        //         if(queue.peek().left!=null) queue.offer(queue.peek().left);
        //         if(queue.peek().right!=null) queue.offer(queue.peek().right);
        //         queue.poll();
        //     }
        //     count++;
        // }
        // return count;
    }
}

