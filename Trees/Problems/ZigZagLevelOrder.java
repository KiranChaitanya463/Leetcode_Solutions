package Trees.Problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Trees.TreeNode;

public class ZigZagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root==null) return result;
        Queue<TreeNode> queue=new LinkedList<>();
        boolean isLeftToRight=true;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum=queue.size();
            LinkedList<Integer> subList=new LinkedList<>();
            for(int i=0;i<levelNum;i++){
                 TreeNode node = queue.poll(); 

                if (isLeftToRight) {
                    subList.addLast(node.val);
                } else {
                    subList.addFirst(node.val);
                }

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            isLeftToRight=!isLeftToRight;
            result.add(subList);
        }
        return result;
    }
}
