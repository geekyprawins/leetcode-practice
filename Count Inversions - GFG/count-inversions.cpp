// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
class Solution{
  public:
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
long long mergeSort(long long  arr[],long long s,long long  e)
    {
        if(s>=e)return 0;
        int mid=(s+e)/2;
        long long c1=mergeSort(arr,s,mid);
        long long c2=mergeSort(arr,mid+1,e);
        long long ci=merge(arr,s,mid,e);
        return c1+c2+ci;
    }
    long long merge(long long  arr[],long long  s,int mid, long long e)
    {
        long long i=s;
        long long j=mid+1;
        vector<long long > temp;
        long long  cnt=0;
        while(i<=mid and j<=e)
        {
            if(arr[i]<=arr[j])
                temp.push_back(arr[i++]);
            else 
            {
                cnt+=mid-i+1;
                temp.push_back(arr[j]);
                j++; 
            }
        }
        while(i<=mid)temp.push_back(arr[i++]);
        while(j<=e)temp.push_back(arr[j++]);
        int k=0;
        for(int idx=s;idx<=e;idx++)
        {
            arr[idx]=temp[k++];
        }
        return cnt;
    }
    long long int inversionCount(long long  int arr[], long long int N)
    {
        // Your Code Here
        long long c=mergeSort(arr,0,N-1);
        return c;
    }
};

// { Driver Code Starts.

int main() {
    
    long long T;
    cin >> T;
    
    while(T--){
        long long N;
        cin >> N;
        
        long long A[N];
        for(long long i = 0;i<N;i++){
            cin >> A[i];
        }
        Solution obj;
        cout << obj.inversionCount(A,N) << endl;
    }
    
    return 0;
}
  // } Driver Code Ends