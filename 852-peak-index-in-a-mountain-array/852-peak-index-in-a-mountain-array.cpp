class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        int m = 0;
        int n = arr.size()-1;
        while(m<=n){
            int mid = m + (n-m)/2;
            if(arr[mid]<arr[mid+1]) m = mid+1;
            else n = mid-1;
        }
        return m;
        
    }
};