class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def countNodes(self, root: TreeNode) -> int:
        if root == None:
            return 0
        return self.count(root, 0)
    def count(self, root: TreeNode, nodes: int) -> int:
        if root == None:
            return nodes
        nodes += 1
        nodes = self.count(root.left, nodes)
        nodes = self.count(root.right, nodes)
        return nodes
    
if __name__ == "__main__":
    solution = Solution()
    root = TreeNode(1, TreeNode(2, TreeNode(4), TreeNode(5)), TreeNode(3))
    print(solution.countNodes(root)) 