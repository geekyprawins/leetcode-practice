// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends

class Solution{
    public:
    int lastIndex(string s) 
    {
        map<char,int> m = {
            {'0', -1},{'1',-1}
        };
        for(int i = 0 ; i<s.size(); i++){
            if(s[i]=='1'){
                m[s[i]] = i;
            }
        }
        return m['1'];
    }

};

// { Driver Code Starts.

int main() {
    long long t;
    cin >> t;
    while (t--) {
        string s;
        cin >> s;
        Solution ob;
        cout << ob.lastIndex(s) << endl;
    }
    return 0;
}  // } Driver Code Ends