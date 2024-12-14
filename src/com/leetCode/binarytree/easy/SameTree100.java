package com.leetCode.binarytree.easy;

class Solution100 {
	public boolean isSameTree(TreeNode p, TreeNode q) {

		return preOrder(p, q);
	}

	public boolean preOrder(TreeNode p, TreeNode q) {
		if (p == null || q == null) {
			return false;
		}
		if (p == null && q == null)
			return true;
		if (p.val != q.val)
			return false;

		return preOrder(p.right, q.right) && preOrder(p.left, q.left);
		

	}
}

public class SameTree100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
