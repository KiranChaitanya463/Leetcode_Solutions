package Trees.Problems;

import java.util.HashMap;
import java.util.Map;

import Trees.TreeNode;

//lc106
public class ConstructBTWithInAndPost {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=inorder.length;
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        return build(postorder,inorder,0,n-1,0,n-1,map);
    }
     public TreeNode build(int[] postorder, int[] inorder,int Istart,int Iend, int Pstart,int Pend, Map<Integer,Integer> map){
        if(Pstart>Pend || Istart>Iend) return null;
        TreeNode root=new TreeNode(postorder[Pend]);
        int inRoot=map.get(root.val);
        int numsLeft=inRoot-Istart;

        root.left=build(postorder,inorder,Istart,inRoot-1,Pstart,Pstart+numsLeft-1,map);
        root.right=build(postorder,inorder,inRoot+1,Iend,Pstart+numsLeft,Pend-1,map);
        return root;
    }
}
