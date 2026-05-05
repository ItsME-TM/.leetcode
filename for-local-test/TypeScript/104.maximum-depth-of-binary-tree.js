"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class TreeNode {
    val;
    left;
    right;
    constructor(val, left, right) {
        this.val = (val === undefined) ? 0 : val;
        this.left = (left === undefined) ? null : left;
        this.right = (right === undefined) ? null : right;
    }
}
class Solution {
    maxDepth(root) {
        return this.maxDepthFinder(root, 0);
    }
    maxDepthFinder(node, depth) {
        if (node === null)
            return depth;
        const leftDepth = this.maxDepthFinder(node.left, depth + 1);
        const rightDepth = this.maxDepthFinder(node.right, depth + 1);
        return Math.max(leftDepth, rightDepth);
    }
}
//Test the solution
const root = new TreeNode(1);
root.left = new TreeNode(2);
root.right = new TreeNode(3);
root.left.left = new TreeNode(4);
root.left.right = new TreeNode(5);
const solution = new Solution();
console.log(solution.maxDepth(root));
//# sourceMappingURL=104.maximum-depth-of-binary-tree.js.map