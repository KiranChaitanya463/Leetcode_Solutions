package Trees.Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import Trees.TreeNode;

public class NodesFromTargetWithLenK {
    public static void main(String[] args) {
        TreeNode root=createTree();
        HashMap<TreeNode,TreeNode> map=new HashMap<>();
        List<Integer> result;
        traverse(root,map);

        // for(Map.Entry<TreeNode,TreeNode> entry : map.entrySet()){
        //     if(entry.getValue()!=null)
        //     System.out.println(entry.getKey().val + "- " +entry.getValue().val);
        //     else
        //     System.out.println(entry.getKey().val+ "- " + null);
        // }

        result=find(root,root.left,map,2);
        System.out.println(result);
    }

    public static List<Integer> find(TreeNode root,TreeNode target,HashMap<TreeNode,TreeNode> map, int dis){
        List<Integer> result=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        Set<TreeNode> set=new HashSet<>();
        q.offer(target);
        set.add(target);
        int distance =0;
        while(distance<dis){
            distance++;
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode node=q.poll();
                if(!set.contains(map.get(node)) && map.get(node)!=null){
                    q.offer(map.get(node));
                    set.add(map.get(node));
                }
                if(!set.contains(node.left) && node.left!=null){
                    q.offer(node.left);
                    set.add(node.left);
                }
                if(!set.contains(node.right) && node.right!=null){
                    q.offer(node.right);
                    set.add(node.right);
                }
            }
        }
        while(!q.isEmpty()){
            result.add(q.poll().val);
        }
        return result;
    }
    public static void traverse(TreeNode root,HashMap<TreeNode,TreeNode> map){
        Queue<TreeNode> q=new LinkedList<>();
        map.put(root,null);
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                    map.put(q.peek().left, q.peek());
                } 
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                    map.put(q.peek().right, q.peek());
                } 
                q.poll();
            }
        }
    }

    public static TreeNode createTree(){
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(5);
        root.right=new TreeNode(1);
        root.left.left=new TreeNode(6);
        root.left.right=new TreeNode(2);
        root.left.right.left=new TreeNode(7);
        root.left.right.right=new TreeNode(4);
        root.right.left=new TreeNode(0);
        root.right.right=new TreeNode(8);
        return root;
    }
}