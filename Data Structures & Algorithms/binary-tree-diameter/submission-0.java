/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        calculateDiameter(root);
        return maxDiameter;
    }

    public int calculateDiameter(TreeNode node) {
        if(node == null) {
            return 0;
        }

        int leftResult = calculateDiameter(node.left);
        int rightResult = calculateDiameter(node.right);

        maxDiameter = Math.max(maxDiameter, leftResult + rightResult);

        return Math.max(leftResult, rightResult) + 1;
    }
}
