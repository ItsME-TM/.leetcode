
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
    public static void main(String[] args){
        Solution solution = new Solution();

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);

        System.out.println(solution.minDepth(root1)); // 2

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);

        System.out.println(solution.minDepth(root2)); // 2
    }

}


