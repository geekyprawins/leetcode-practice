// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

int strstr(string ,string);

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        string a;
        string b;
        
        cin>>a;
        cin>>b;
        
        cout<<strstr(a,b)<<endl;
    }
}
// } Driver Code Ends


//Function to locate the occurrence of the string x in the string s.
int strstr(string s, string x)
{
     //Your code here
     for(int i=0;i<s.size();i++)
    {
         string s1=s.substr(i,x.size());
         string s2=x.substr(0,x.size());
         
            if(s1==s2)
            {
                return i;
            }
    }return -1;
}