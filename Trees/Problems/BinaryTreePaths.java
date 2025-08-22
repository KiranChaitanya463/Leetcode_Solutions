package Trees.Problems;

import java.util.ArrayList;
import java.util.List;

import Trees.TreeNode;

// lc257
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList<>();
        // List<Integer> list=new ArrayList<>();
        // List<List<Integer>> paths=new ArrayList<>();
        // find(root,list,paths);
        // for(List<Integer> innerList : paths){
        //     StringBuilder sb=new StringBuilder();
        //     for(int n : innerList){
        //         sb.append(n);
        //         sb.append("->");
        //     }
        //     sb.deleteCharAt(sb.length()-1);
        //     sb.deleteCharAt(sb.length()-1);
        //     result.add(sb.toString());
        // }
        // return result;

        StringBuilder sb=new StringBuilder();
        findPaths(root,sb,result);
        return result;
    }
    public void findPaths(TreeNode root,StringBuilder sb,List<String> result){
        if (root == null) return;

        int len = sb.length(); // save state
        sb.append(root.val);

        if (root.left == null && root.right == null) {
            // leaf node -> add path
            result.add(sb.toString());
        } else {
            sb.append("->");
            findPaths(root.left, sb, result);
            findPaths(root.right, sb, result);
        }

        sb.setLength(len); // backtrack: restore StringBuilder
    }
    public void find(TreeNode root,List<Integer> list,List<List<Integer>> pathLists){
        if(root==null) return;
        else {
            list.add(root.val);
        }
        if(root.left==null && root.right==null){
            pathLists.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }
        find(root.left,list,pathLists);
        find(root.right,list,pathLists);
        list.remove(list.size()-1);
    }
}
