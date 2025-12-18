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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root==null) return new ArrayList();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<Integer>();
            for(int i=0;i<size;i++){
                
                temp.add(q.peek().val);
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);

                q.poll();
            }
            ans.add(temp);
        }
        return ans;

    }
}