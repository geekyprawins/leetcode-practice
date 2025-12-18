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
    public int widthOfBinaryTree(TreeNode root) {
        // If the root is null, return 0
        if (root == null)
            return 0;

        // Initialize max width
        int maxWidth = 0;

        // Queue to store node and its index
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();

        // Push root with index 0
        q.offer(new Pair<>(root, 0));

        // BFS traversal
        while (!q.isEmpty()) {

            // Get size of current level
            int size = q.size();

            // Get the minimum index at this level
            int minIndex = q.peek().getValue();

            // Variables to store first and last index
            int first = 0, last = 0;

            // Traverse all nodes in this level
            for (int i = 0; i < size; i++) {

                // Get current node and index
                Pair<TreeNode, Integer> p = q.poll();
                TreeNode node = p.getKey();
                int currIndex = p.getValue() - minIndex;

                // Update first index
                if (i == 0)
                    first = currIndex;

                // Update last index
                if (i == size - 1)
                    last = currIndex;

                // Push left child if exists
                if (node.left != null)
                    q.offer(new Pair<>(node.left, 
                        2 * currIndex + 1));

                // Push right child if exists
                if (node.right != null)
                    q.offer(new Pair<>(node.right, 
                        2 * currIndex + 2));
            }

            // Update maximum width
            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        // Return the final result
        return maxWidth;
    }
}