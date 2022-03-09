// { Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

 // } Driver Code Ends
//User function template for C++
class Solution{
public:
	// Function to check if the
	// Pythagorean triplet exists or not
	bool checkTriplet(int arr[], int n) {
	    // code here
	    // initializing unordered map with key and value as
    // integers
    unordered_map<int, int> umap;
     
    // Increase the count of array elements in unordered map
    for (int i = 0; i < n; i++)
        umap[arr[i]]++;
 
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {   
            // calculating the squares of two elements as
            // integer and float
            int p = sqrt(arr[i] * arr[i] + arr[j] * arr[j]);
            float q
                = sqrt(arr[i] * arr[i] + arr[j] * arr[j]);
             
            // Condition is true if the value is same in
            // integer and float and also the value is
            // present in unordered map
            if (p == q && umap[p] != 0)
                return true;
        }
    }
    
    // If we reach here, no triplet found
    return false;
	}
};

// { Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, i;
        cin >> n;
        int arr[n];
        for (i = 0; i < n; i++) {
            cin >> arr[i];
        }
        Solution ob;
        auto ans = ob.checkTriplet(arr, n);
        if (ans) {
            cout << "Yes\n";
        } else {
            cout << "No\n";
        }
    }
    return 0;
}
  // } Driver Code Ends