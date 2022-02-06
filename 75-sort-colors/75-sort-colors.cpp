class Solution {
public:
    void sortColors(vector<int>& nums) {
        int freq[3] = {0};
        for (int i = 0; i < nums.size(); i++) {
            freq[nums[i]]++;
        }
        int k = 0;
        for (int i = 0; i < 3; i++) {
            while (freq[i]--) {
                nums[k++] = i;
            }
        }
        
    }
};