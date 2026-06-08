
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
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        return count(root, 0);
    }
    public int count (TreeNode root, int nodes){
        if (root == null) return nodes;
        nodes++;
        nodes = count(root.left, nodes);
        nodes = count(root.right, nodes);
        return nodes;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        Solution sol = new Solution();
        int count = sol.countNodes(root);
        System.out.println("Number of nodes in the complete binary tree: " + count);
    }
}


