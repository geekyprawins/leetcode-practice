class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l =0, r=n-1;
        int lMax = 0, rMax = 0;
        int total = 0;
        while(l<r){
            if(height[l]<height[r]){
                if(lMax>height[l]) total += lMax - height[l];
                else lMax = height[l];
                l++;
            }
            else{
                if(rMax>height[r]) total += rMax - height[r];
                else rMax = height[r];
                r--;
            }
        }

        return total;
    }
}