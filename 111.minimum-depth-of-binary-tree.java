/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        return findMinimumDepth(root);
    }
    private int findMinimumDepth(TreeNode node){
        if (node ==  null) return 0;
        if(node.left == null && node.right == null) return 1;
        //if only right child is available
        if(node.left == null){
            return findMinimumDepth(node.right) + 1;
        }
        //if only left child is available
        if(node.right == null){
            return findMinimumDepth(node.left) + 1;
        }
        //if node has both left and right child
        return Math.min(findMinimumDepth(node.left), findMinimumDepth(node.right)) + 1;
    }
}
// @lc code=end

