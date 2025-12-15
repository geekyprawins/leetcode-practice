class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        Stack<Integer> st = new Stack();
        List<Integer> ng = new ArrayList<Integer>();
        
        for(int i=0;i<n;i++){
            int found = 0;
            for(int j=i+1;j<n;j++){
                if(nums2[j]>nums2[i]){
                    ng.add(nums2[j]);
                    found=1;
                    break;
                }  
            }
            if(found==0) ng.add(-1);

        }

        int m = nums1.length;
        int[] ans = new int[m];
        List<Integer> n2List = new ArrayList<>(); 
        for (int value : nums2) {
            n2List.add(value); 
        }
        for(int i=0;i<m;i++){
            int ind = n2List.indexOf(nums1[i]);
            ans[i] = ng.get(ind);
        }

        return ans;
    }
}