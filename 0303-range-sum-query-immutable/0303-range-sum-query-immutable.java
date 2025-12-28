class NumArray {
    List<Integer> arr = new ArrayList();
    List<Integer> preSum = new ArrayList();
    int sum = 0;
    public NumArray(int[] nums) {
        for(int num: nums){
            arr.add(num);
            sum+=num;
            preSum.add(sum);
        }
    }
    
    public int sumRange(int left, int right) {
        return preSum.get(right) - preSum.get(left) + arr.get(left);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */