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
class BSTIterator {
    private Stack<TreeNode> st = new Stack<TreeNode>();
    boolean reverse = true; // before(), else next()
    public BSTIterator(TreeNode root, boolean isReverse ) {
        reverse = isReverse;
        pushAll(root);
    }
    
    public int next() {
       TreeNode temp =  st.pop();
       if(reverse == true) pushAll(temp.left);
       else pushAll(temp.right);
       return temp.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
    private void pushAll(TreeNode root){
        while(root!=null){
            st.push(root);
            if(reverse==true) root = root.right;
            else root=root.left;
        }
    }
}

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        BSTIterator l = new BSTIterator(root,false);
        BSTIterator r = new BSTIterator(root,true);

        int i = l.next();
        int j = r.next();

        while(i<j){
            int sum = i+j;
            if(k==sum) return true;
            else if(sum<k){
                i = l.next();
            }
            else j = r.next();
        
        }
        return false;
    }
}