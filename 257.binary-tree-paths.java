/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) return res;
        paths(root, "", res);
        return res;
    }
    public void paths(TreeNode root, String path, List<String> res){
        String cuurentPath = path.isEmpty() ? String.valueOf(root.val) : path + "->" + root.val;
        if (root.left == null && root.right == null) {
            res.add(cuurentPath);
            return;
        }
        if (root.left != null) paths(root.left, cuurentPath, res);
        if (root.right != null) paths(root.right, cuurentPath, res);
    }
}
// @lc code=end

