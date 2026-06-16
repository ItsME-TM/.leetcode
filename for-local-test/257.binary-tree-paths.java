import java.util.ArrayList;
import java.util.List;

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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        Solution solution = new Solution();
        List<String> res = solution.binaryTreePaths(root);
        System.out.println(res);
    }
}

