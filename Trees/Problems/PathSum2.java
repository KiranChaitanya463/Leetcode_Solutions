package Trees.Problems;

import java.util.ArrayList;
import java.util.List;

import Trees.TreeNode;

public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> pathLists=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        paths(list,pathLists,root,targetSum,0);
        return pathLists;
    }
    public void paths(List<Integer> list,List<List<Integer>> pathLists,TreeNode root,int targetSum,int sum){
        if(root==null) return;
        else {
            list.add(root.val);
            sum+=root.val;
        }
        if(root.left==null && root.right==null){
            if(sum==targetSum){
                pathLists.add(new ArrayList<>(list));
            }
            list.remove(list.size()-1);
            return;
        }
        paths(list,pathLists,root.left,targetSum,sum);
        paths(list,pathLists,root.right,targetSum,sum);
        list.remove(list.size()-1);
    }
}
