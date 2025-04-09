package pl.sebastianklimas.lc110BalancedBinaryTree;


class Solution {
    public boolean isBalanced(TreeNode root) {
        return calculateDepth(root) != -1;
    }

    public int calculateDepth(TreeNode root) {
        if (root == null) return 0;

        int leftH = calculateDepth(root.left);
        if (leftH == -1) return -1;

        int rightH = calculateDepth(root.right);
        if (rightH == -1) return -1;

        if (Math.abs(leftH - rightH) > 1) return -1;

        return 1 + Math.max(leftH, rightH);
    }

    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
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

}
