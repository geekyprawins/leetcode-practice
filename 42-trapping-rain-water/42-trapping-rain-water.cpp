class Solution {
public:
    int trap(vector<int>& height) {

        // code here
        int n = height.size();
        int left = 0 , right = n-1;
        int maxRight = 0 , maxLeft = 0;
        int res = 0;
        
        while(left<right){
            
            if(height[left] <= height[right]){
                if(height[left] >= maxLeft){
                    maxLeft = height[left];
                }
                else{
                    res+= maxLeft-height[left];
                }
                left++;
            }
            else{
                  if(height[right] >= maxRight){
                    maxRight = height[right];
                }
                else{
                    res+= maxRight-height[right];
                }
                right--;
            }
        }
        return res;
    

    }
};