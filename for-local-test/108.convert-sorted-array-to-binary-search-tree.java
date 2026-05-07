import java.util.LinkedList;
import java.util.Queue;

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
    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(nums, 0, nums.length-1);
    }
    private TreeNode bst(int[] nums, int left, int right){
        if(left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = bst(nums, left, mid - 1);
        node.right = bst(nums, mid + 1, right);
        return node;
    }
    public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {-10, -3, 0, 5, 9};
    
    TreeNode root = solution.sortedArrayToBST(nums);
    
    // Print level-order (BFS) to see the tree structure
    System.out.print("Level-order: ");
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
        TreeNode curr = queue.poll();
        if (curr == null) {
            System.out.print("null ");
        } else {
            System.out.print(curr.val + " ");
            queue.add(curr.left);
            queue.add(curr.right);
        }
    }
    System.out.println();

    // Print in-order (Left → Root → Right) — should give sorted array back
    System.out.print("In-order:    ");
    inOrder(root);
    System.out.println();
}

// Helper: in-order traversal
    private static void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }
}


