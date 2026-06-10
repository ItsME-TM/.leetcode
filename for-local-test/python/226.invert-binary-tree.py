class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def invertTree(self, root: TreeNode) -> TreeNode:
        if root == None:
            return None
        temp = root.left
        root.left = self.invertTree(root.right)
        root.right = self.invertTree(temp)
        return root
    def printTree(self, root: TreeNode) -> None:
        if root == None:
            return
        print(root.val)
        self.printTree(root.left)
        self.printTree(root.right)
if __name__ == "__main__":
    solution = Solution()
    root = TreeNode(1, TreeNode(2, TreeNode(4), TreeNode(5)), TreeNode(3))
    print("Original Tree:")
    solution.printTree(root)
    inverted_root = solution.invertTree(root)
    print("Inverted Tree:")
    solution.printTree(inverted_root)
