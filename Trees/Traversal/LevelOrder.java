package Trees.Traversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Trees.TreeNode;

public class LevelOrder {
    
}
class Solution {

    // BFS Level order
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> wrapResult=new LinkedList<List<Integer>>();
        if(root==null) return wrapResult;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum=queue.size();
            List<Integer> list=new LinkedList<>();
            for(int i=0;i<levelNum;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                list.add(queue.poll().val);
            }
            wrapResult.add(list);
        }
        return wrapResult;
    }
}
