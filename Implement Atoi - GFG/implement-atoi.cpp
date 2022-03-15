// { Driver Code Starts
//Initial template for C++

#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
//User function template for C++

class Solution{
  public:
    /*You are required to complete this method */
    int atoi(string str) {
        //Your code here
        int res = 0;
        bool isNeg = 0;
        if(str[0] =='-'){
            isNeg = 1;
            str.erase(0,1);
        }
        for(auto c : str){
            if(c >= '0' and c<= '9'){
                res = res * 10 + (c - '0');
            }
            else return -1;
        }
        return isNeg? -res : res;
    }
};

// { Driver Code Starts.
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		string s;
		cin>>s;
		Solution ob;
		cout<<ob.atoi(s)<<endl;
	}
}  // } Driver Code Ends