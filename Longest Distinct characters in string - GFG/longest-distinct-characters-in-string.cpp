// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;
int longestSubstrDistinctChars (string S);
int main()
{
    int t; cin >> t;
    while (t--)
    {
        string S; cin >> S;

        cout << longestSubstrDistinctChars (S) << endl;
    }
}

// Contributed By: Pranay Bansal
// } Driver Code Ends


int longestSubstrDistinctChars (string S)
{
    // your code here
    unordered_map<char,int> mp;
    int i=0,j=0,ans=0;
    
    while(j<S.length())
    {
        mp[S[j]]++;
        
        while(mp.size()<j-i+1)
        {
            mp[S[i]]--;
            
            if(mp[S[i]]==0)
            mp.erase(S[i]);
            
            i++;
        }
        
        if(mp.size()==j-i+1)
        ans=max(ans,j-i+1);
        
        j++;
    }
    
    return ans;
}