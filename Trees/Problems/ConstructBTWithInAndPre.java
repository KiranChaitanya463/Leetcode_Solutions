package Trees.Problems;

import java.util.HashMap;
import java.util.Map;

import Trees.TreeNode;

//lc105
public class ConstructBTWithInAndPre {
     public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=inorder.length;
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        return build(preorder,inorder,0,n-1,0,n-1,map);
    }
    public TreeNode build(int[] preorder, int[] inorder,int Istart,int Iend, int Pstart,int Pend, Map<Integer,Integer> map){
        if(Istart>Iend || Pstart>Pend) return null;
        TreeNode root=new TreeNode(preorder[Pstart]);
        int inRoot=map.get(root.val);
        int numsLeft=inRoot-Istart;

        root.left=build(preorder,inorder,Istart,inRoot-1,Pstart+1,Pstart+numsLeft,map);
        root.right=build(preorder,inorder,inRoot+1,Iend,Pstart+numsLeft+1,Pend,map);

        return root;
    }
}
