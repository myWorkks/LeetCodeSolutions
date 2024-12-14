package com.leetCode.binarytree.easy;

import java.util.ArrayList;
import java.util.List;

class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list= new ArrayList<Integer>();
        if(root != null){
            list.add(root.val);
            list.addAll(preorderTraversal(root.left));
             list.addAll(preorderTraversal(root.right));
        }
       return list; 
    }
}
public class BinaryTreePreorderTraversal144 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
