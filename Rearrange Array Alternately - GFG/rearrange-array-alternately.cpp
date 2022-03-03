// { Driver Code Starts
// C++ program to rearrange an array in minimum 
// maximum form 
#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
class Solution{
    public:
    // This function wants you to modify the given input
    // array and no need to return anything
    // arr: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    void rearrange(long long *arr, int n) 
    { 
    	
    	// Your code here
     vector<pair<long, long>> pp; //stores least and greatest value
       for(int i=0; i<n/2; i++)
       {

           // pair of {6,1}, {5,2}, {4,3} is stored
           pp.push_back({arr[n-i-1] , arr[i]} );  
       }
       //if array is odd in size, we simply want to put, middle element at last index in the array
       if( n%2!= 0 ) pp.push_back({arr[n/2], 0});  
       for(int i=0, j=0; i< n, j<pp.size(); i= i+2, j++)
       {
           arr[i]= pp[j].first;
           arr[i+1]= pp[j].second;
       }
    	
    	
    	 
    }
};

// { Driver Code Starts.

// Driver program to test above function 
int main() 
{
    int t;
    
    //testcases
    cin >> t;
    
    while(t--){
        
        //size of array
        int n;
        cin >> n;
        
        long long arr[n];
        
        //adding elements to the array
        for(int i = 0;i<n;i++){
            cin >> arr[i];
        }
        
        Solution ob;
        
        //calling rearrange() function
        ob.rearrange(arr, n);
        
        //printing the elements
        for (int i = 0; i < n; i++) 
		    cout << arr[i] << " ";
		
		cout << endl;
    }
	return 0; 
} 
  // } Driver Code Ends