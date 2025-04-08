package pl.sebastianklimas.lc108ConvertSortedArrayToBinarySearchTree;


import java.util.Arrays;

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int middleIndex = nums.length / 2;

        return new TreeNode(nums[middleIndex], middle(Arrays.copyOfRange(nums, 0, middleIndex)), middle(Arrays.copyOfRange(nums, middleIndex + 1, nums.length)));
    }

    public TreeNode middle(int[] nums) {
        if (nums.length == 0) return null;
        if (nums.length == 1) return new TreeNode(nums[0]);
        int middleIndex = nums.length / 2;
        TreeNode root = new TreeNode(nums[middleIndex]);
        root.left = middle(Arrays.copyOfRange(nums, 0, middleIndex));
        root.right = middle(Arrays.copyOfRange(nums, middleIndex + 1, nums.length));
        return root;
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
