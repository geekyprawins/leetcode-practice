class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length -2;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == nums[mid^1]){
                //shrink left half
                low = mid+1;
            }
            //shrink right half
            else high = mid-1;
        }
        return nums[low];
    }
}