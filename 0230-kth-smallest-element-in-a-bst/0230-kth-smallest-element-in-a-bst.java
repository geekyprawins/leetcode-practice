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
    public void inOrderHelper(TreeNode root, List<Integer> ans){
        if(root==null) return;
        inOrderHelper(root.left,ans);
        ans.add(root.val);
        inOrderHelper(root.right,ans);
    }
    public List<Integer> inOrder(TreeNode root){
        List<Integer> ans = new ArrayList<Integer>();
        inOrderHelper(root,ans);
        return ans;
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> sortedArray = inOrder(root);
        return sortedArray.get(k-1);
    }
}