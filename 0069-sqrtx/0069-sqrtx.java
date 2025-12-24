class Solution {
    public int mySqrt(int x) {
        if(x==0||x==1) return x;
        int low = 1, high = x;
        int ans = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            long squr = (long) mid*mid;
            if(squr==x) return mid;
            else if(squr<x){
                low=mid+1;
                ans=mid;
            }
            else high=mid-1;
        }
        return ans;
    }
}