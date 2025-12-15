class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        Stack<Integer> st = new Stack();
        int[] ng = new int[n];
        
        for(int i=n-1;i>=0;i--){
            while(!st.empty() && st.peek()<=nums2[i]){
                st.pop();
            }
            ng[i] = st.empty() ? -1 : st.peek();
            st.push(nums2[i]);
        }

        int m = nums1.length;
        int[] ans = new int[m];
        List<Integer> n2List = new ArrayList<>(); 
        for (int value : nums2) {
            n2List.add(value);
        }
        for(int i=0;i<m;i++){
            int ind = n2List.indexOf(nums1[i]);
            ans[i] = ng[ind];
        }

        return ans;
    }
}