package Trees.Problems;

import Trees.TreeNode;

//lc114
public class FlattenBTtoLL {

    // check the second method it might be better.
    public void flatten(TreeNode root) {

        // so the thing is i tried to create the new nodes and try to attach to the root node
        // but it wont work because when an object is sent via the method it sends the copy 
        // of the reference and we modify the contents with that reference within the object
        // but we can change that particular reference to another object rather it will point
        // to new object and it does not change the original object whcih having the original 
        // reference. so we have change that in place

        if(root==null) return;

        flatten(root.left);
        flatten(root.right);

        TreeNode left=root.left;
        TreeNode right=root.right;

        root.left=null;
        root.right=left;

        TreeNode curr=root;
        while(curr.right!=null) curr=curr.right;

        curr.right=right;
    }

    //slightly differnt approach (Strivers)

    // TreeNode prev=null;
    // public void flatten(TreeNode root) {
    //     if(root==null) return;
    //     flatten(root.right);
    //     flatten(root.left);
    //     root.right=prev;
    //     root.left=null;
    //     prev=root;
    // }
}
