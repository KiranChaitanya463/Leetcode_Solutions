package Trees.Problems;

import java.util.ArrayList;
import java.util.List;

import Trees.TreeNode;

public class BTRightSideView {
    //its simple a pre order traversal but for this right view we modified from rlr to rrl means we check right first
    // and we maintain our resultant list which when we get to the level which is equal to the size of list means we are at the first the element of that level 
    // so we add to the list and while going left or for the next recursion we increment the level

    // if we need the left side view we just normally go with the root left right which we consider the left border.
}
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        rightView(root,0,list);
        return list;
    }
    public void rightView(TreeNode root, int level, List<Integer> list){
        if(root==null) return;
        if(level==list.size()) list.add(root.val);
        rightView(root.right,level+1,list);
        rightView(root.left,level+1,list);
    }
}