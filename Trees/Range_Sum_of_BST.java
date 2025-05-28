class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        // ------------------------------
        // Better (Naive) Approach:
        // ------------------------------
        // Traverse the entire tree.
        // For every node, check if it lies within the range [low, high].
        // Always call both left and right subtrees.
        // Time Complexity: O(n), where n is the number of nodes in the tree.
        // Space Complexity: O(h), where h is the height of the tree (due to recursion stack).
        
        if(root == null) return 0;
        int sum = 0;

        // Always explore the left subtree

        sum += rangeSumBST(root.left, low, high);

        // Add current node's value if it's in the range

        if(root.val >= low && root.val <= high)
            sum += root.val;

        // Always explore the right subtree
        sum += rangeSumBST(root.right, low, high);

        return sum;
        

        // ------------------------------
        // Optimized Approach:
        // ------------------------------
        // Prune unnecessary branches.
        // Only visit the left subtree if root.val > low (because left children are smaller).
        // Only visit the right subtree if root.val < high (because right children are larger).
        // This reduces traversal for balanced BSTs significantly.
        // Time Complexity: Average case O(log n), Worst case O(n)
        // Space Complexity: O(h), where h is the height of the tree.

        if(root == null) return 0;
        int sum = 0;

        // Only check left subtree if there's a chance of finding values ≥ low
        if(root.val > low)
            sum += rangeSumBST(root.left, low, high);

        // Add current node's value if it's within range
        if(root.val >= low && root.val <= high)
            sum += root.val;

        // Only check right subtree if there's a chance of finding values ≤ high
        if(root.val < high)
            sum += rangeSumBST(root.right, low, high);

        return sum;
    }
}
