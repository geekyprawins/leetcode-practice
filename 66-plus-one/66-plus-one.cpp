class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int l = digits.size();
        for(int i=l-1 ; i>=0 ; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }
            else{
                digits[i]++;
                return digits;
            }
        }
            digits[0] = 1;
            digits.push_back(0);
            return digits;    }
};