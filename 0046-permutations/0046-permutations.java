class Solution {
    private void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void recurPermute(int index, int[] nums, List<List<Integer>> ans){
        if(index==nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i : nums) ds.add(i);
            ans.add(ds);
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            recurPermute(index+1,nums,ans);
            swap(i,index,nums); //backtrack
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recurPermute(0,nums,ans);
        return ans;
    }
}