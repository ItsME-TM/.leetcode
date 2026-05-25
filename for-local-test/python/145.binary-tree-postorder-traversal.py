class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def postorderTraversal(self, root) -> list[int]:
        res = []
        self._postorder(root, res)
        return res
    def _postorder(self, root, res):
        if not root:
            return
        self._postorder(root.left, res)
        self._postorder(root.right, res)
        res.append(root.val)
    
if __name__ == "__main__":
    # Create a binary tree
    root = TreeNode(1)
    root.right = TreeNode(2)
    root.right.left = TreeNode(3)

    solution = Solution()
    print(solution.postorderTraversal(root))  # Output: [3, 2, 1]