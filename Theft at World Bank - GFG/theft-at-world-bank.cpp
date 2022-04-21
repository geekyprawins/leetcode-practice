// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
class Solution{
    bool perfectSquare(long long  n){
       long long  k = sqrt(n);
       return k * k == n;
   }
   
    static bool comp(pair<long long , long long>& a , pair<long long ,long long >& b){
       return a.second * b.first > a.first * b.second;
   }
	public:
	long double maximumProfit(int N, long long C, vector<long long> w, vector<long long> p){
	    // Code here.
	pair<long long ,long long>P[N];
	
    for(int i = 0 ; i < N; i++)
        P[i] = {w[i] , p[i]};
        
    sort(P , P + N , comp);
    
    long double res = 0.0;
    
    for(int i = 0 ; i < N ; i++){
        long long cost = P[i].second , weight = P[i].first;
        if(perfectSquare(weight))
        continue;
        if(weight <= C)
        {
            res += (double)cost;
            C -= weight;
        }
        else{
            res += (double)(cost * C) / (double)weight;
            break;
        }
    }
    return res;
	    
	}
};

// { Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n;
		long long C;
		cin >> n >> C;
		vector<long long > w(n), p(n);
		for(int i = 0; i < n; i++){
		    cin >> w[i] >> p[i];
		}
		Solution ob;
		long double ans = ob.maximumProfit(n, C, w, p);
		cout << fixed << setprecision(3) << ans << "\n";
	}  
	return 0;
}  // } Driver Code Ends