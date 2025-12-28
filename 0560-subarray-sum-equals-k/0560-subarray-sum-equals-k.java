class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        Map<Integer,Integer> mp  = new HashMap<>();
        mp.put(0,1); // to handle k = prefixSum case -> pick the subarray -> hence count 1

        for(int i = 0; i<nums.length;i++){
           prefixSum += nums[i];
           int req = prefixSum - k;

          if(mp.containsKey(req)){
                count += mp.get(req);
            }
            
            mp.put(prefixSum, mp.getOrDefault(prefixSum,0)+1);
        }

        return count;
    }
}