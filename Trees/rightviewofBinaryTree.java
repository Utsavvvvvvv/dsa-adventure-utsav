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
    
    /**
     * This method returns the list of rightmost nodes at each level of the binary tree.
     * It performs a modified preorder traversal (Root -> Right -> Left).
     */
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        // Edge case: if the root is null, return an empty list
        if (root == null) return result;

        // Start recursive preorder traversal from the root at level 1
        preorder(root, 1, result);
        return result;
    }

    /*
     * Recursive helper method for preorder traversal (Root -> Right -> Left).
     * It ensures that the first node encountered at each level (from right to left)
     * is added to the result list.
     *
     *  root   The current TreeNode
     *  level  The current level in the tree (root starts at level 1)
     *  result The list storing the right side view nodes
     */
    public void preorder(TreeNode root, int level, List<Integer> result) {
        if (root == null) return;

        // If this is the first node visited at this level, add it to the result
        if (result.size() < level)
            result.add(root.val);

        // Traverse the right subtree first to ensure rightmost nodes are visited first
        preorder(root.right, level + 1, result);

        // Then traverse the left subtree
        preorder(root.left, level + 1, result);
    }
}
