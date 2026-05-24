

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def preorderTraversal(self, root):
        res = []
        if not root:
            return res
        stack = [root]
        while stack:
            node = stack.pop()
            res.append(node.val)
            if node.right:
                stack.append(node.right)
            if node.left:
                stack.append(node.left)
        return res
    
if __name__ == "__main__":
    # Create a binary tree
    root = TreeNode(1)
    root.right = TreeNode(2)
    root.right.left = TreeNode(3)

    solution = Solution()
    print(solution.preorderTraversal(root))  # Output: [1, 2, 3]