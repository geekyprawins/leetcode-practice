// { Driver Code Starts
//Initial template for C++

#include<bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
//User function template for C++

class Solution{
  public:
    
    string longestCommonPrefix (string arr[], int N)
    {
        // your code here
       sort(arr,arr+N);
       
       int minL = min(arr[0].size() , arr[N-1].size());
       
       string first = arr[0], last = arr[N-1];
       int i = 0;
       
       while(i<minL && first[i] == last[i]){
           i++;
       }
       
       string pre = first.substr(0,i);
       
       return pre.size()==0 ? "-1" : pre;
    }
};


// { Driver Code Starts.
int main()
{
    int t; cin >> t;
    while (t--)
    {
        int n; cin >> n;
        string arr[n];
        for (int i = 0; i < n; ++i)
            cin >> arr[i];
        
        Solution ob;
        cout << ob.longestCommonPrefix (arr, n) << endl;
    }
}

// Contributed By: Pranay Bansal
  // } Driver Code Ends