class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 
class Solution {
    public int maxDepth(TreeNode root) {
        return maxDepthFinder(root, 0);
    }

    private int maxDepthFinder(TreeNode node, int depth){
        if(node == null) return depth;
        int leftDepth = maxDepthFinder(node.left, depth + 1);
        int rightDepth = maxDepthFinder(node.right, depth + 1);
        return Math.max(leftDepth, rightDepth);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution solution = new Solution();
        System.out.println(solution.maxDepth(root)); // Output: 3
    }
}