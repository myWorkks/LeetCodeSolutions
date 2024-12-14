package com.leetCode.binarytree.easy;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

class Solution94 {

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		if(root!=null) {
			list.add(root.val);
			List<Integer> left=	inorderTraversal(root.left);
			List<Integer> right=	inorderTraversal(root.right);
			list.addAll(right);
			list.addAll(left);
		}
		return list;
	}
}

public class BinaryTreeInorderTraversal94 {

	public static void main(String[] args) {

	}

}
