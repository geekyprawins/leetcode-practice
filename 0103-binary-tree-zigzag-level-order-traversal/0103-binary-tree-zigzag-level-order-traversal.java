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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean leftToRight = true;
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            Integer[] temp = new Integer[size];
            for(int i=0;i<size;i++){
                int ind = leftToRight ? i : (size-i-1);
                temp[ind] = q.peek().val;
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);

                q.poll();
            }
            leftToRight = !leftToRight;
            ans.add(Arrays.asList(temp));
        }
        return ans;
    }
}