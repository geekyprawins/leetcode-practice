class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        int fact=1;
        //fact for n-1 and add elements to nums
        for(int i=1;i<n;i++){
            fact = fact*i;
            nums.add(i);
        }
        // add last element also
        nums.add(n);

        String ans = "";
        k = k-1; // 0 based
        while(true){
            ans = ans+nums.get(k/fact);
            nums.remove(k/fact);

            if(nums.size()==0) break;

            k = k%fact;
            fact = fact/nums.size();
        }

        return ans;

    }
}