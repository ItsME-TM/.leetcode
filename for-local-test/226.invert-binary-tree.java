
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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;      
        root.left = invertTree(root.right);  
        root.right = invertTree(temp);
        return root;
    }
    public void printTree(TreeNode node){
        if(node == null) return;
        System.out.print(node.val + " ");
        printTree(node.left);
        printTree(node.right);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        Solution solution = new Solution();
        solution.printTree(root); // Output: 1 2 4 5 3
        System.out.println();
        TreeNode invertedRoot = solution.invertTree(root);
        
        System.out.print("Inverted tree (pre-order): ");
        solution.printTree(invertedRoot);
        System.out.println();
    }
}