package Trees.BST;

import java.util.HashMap;
import java.util.Map;

import Trees.TreeNode;

public class CreateBSTfromPreOrder {
    public TreeNode bstFromPreorder(int[] preorder) {
        // int[] inorder=preorder.clone();
        // Arrays.sort(inorder);
        // return buildTree(preorder,inorder);

        return bst(preorder,Integer.MAX_VALUE,new int[]{0});
    }
    public TreeNode bst(int[] pre,int bound,int[] i){
        if(i[0]==pre.length || pre[i[0]]>bound) return null;
        TreeNode root=new TreeNode(pre[i[0]++]);
        root.left=bst(pre,root.val,i);
        root.right=bst(pre,bound,i);
        return root;
    }

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
