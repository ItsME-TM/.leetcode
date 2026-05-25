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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        postorder(root, res);
        return res;
    }
    private void postorder(TreeNode root, List<Integer> res){
        if(root == null) return;
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        Solution sol = new Solution();
        List<Integer> res = sol.postorderTraversal(root);
        System.out.println(res);
    }
}


