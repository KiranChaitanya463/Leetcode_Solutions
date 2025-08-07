package Trees.Traversal;

import java.util.ArrayList;
import java.util.List;

import Trees.TreeNode;

public class PreOrder{

}
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        traverse(root,list);
        return list;
    }
    public void traverse(TreeNode node,List<Integer> list){
        if(node==null) return;
        list.add(node.val);
        traverse(node.left,list);
        traverse(node.right,list);
    }
}