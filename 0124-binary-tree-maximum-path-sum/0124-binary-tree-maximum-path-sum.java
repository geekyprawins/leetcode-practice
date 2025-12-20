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
    public int maxHelper(TreeNode root, int[] maxi){
        if(root == null) return 0;
        int lPS = Math.max(0,maxHelper(root.left,maxi));
        int rPS = Math.max(0,maxHelper(root.right,maxi));
        int mPS = root.val+lPS+rPS;
        maxi[0] = Math.max(maxi[0],mPS);
        return root.val+Math.max(lPS,rPS);
    }
    public int maxPathSum(TreeNode root) {
        int[] maxi = new int[1];
        maxi[0] = Integer.MIN_VALUE;
        maxHelper(root,maxi);
        return maxi[0];
    }
}