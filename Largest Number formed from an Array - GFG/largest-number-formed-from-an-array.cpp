// { Driver Code Starts
#include <bits/stdc++.h>

using namespace std;


 // } Driver Code Ends
//User function template for C++
class Solution{
public:
	// The main function that returns the arrangement with the largest value as
	// string.
	// The function accepts a vector of strings
  static bool comp(string a,string b)
	{
	    string s1 = a+b;
	    string s2 = b+a;
	    return s1>s2;
	}
	string printLargest(vector<string> &arr) {
	    sort(arr.begin(),arr.end(),comp);
	    int n = arr.size();
	    string str="";
	    for(int i=0;i<n;i++)
	    {
	        str+=arr[i];
	    }
	    return str;
	}
};

// { Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, i;
        cin >> n;
        vector<string> arr(n);
        for (i = 0; i < n; i++) {
            cin >> arr[i];
        }
        Solution ob;
        auto ans = ob.printLargest(arr);
        cout << ans << "\n";
    }
    return 0;
}  // } Driver Code Ends