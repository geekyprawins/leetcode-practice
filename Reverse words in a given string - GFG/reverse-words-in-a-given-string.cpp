// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends


class Solution
{
    public:
    //Function to reverse words in a given string.
    string reverseWords(string S) 
    { 
        // code here 
        vector<string> w;
        string ans = "";
        
        for(auto a:S)
       {
           if(a=='.')
           {
               w.emplace_back(ans);
               w.emplace_back(".");
               ans.clear();
           }
           else
               ans+=a;
       }
       
        for(int i=w.size()-1;i>-1;--i)
           ans+=w[i];
           
       return ans;
    
    } 
};

// { Driver Code Starts.
int main() 
{
    int t;
    cin >> t;
    while (t--) 
    {
        string s;
        cin >> s;
        Solution obj;
        cout<<obj.reverseWords(s)<<endl;
    }
}  // } Driver Code Ends