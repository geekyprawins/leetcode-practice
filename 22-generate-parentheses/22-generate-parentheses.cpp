class Solution {
public:
        void generateParenthesis(string s, int c, int rc, int n,vector<string>& res){
	        if(c+rc==2*n)
		    res.push_back(s);
	        if(c < n)
		    generateParenthesis(s+"(",c+1,rc,n,res);
	        if(rc < c)
		    generateParenthesis(s+")",c,rc+1,n,res);
        }
    
        vector<string> generateParenthesis(int n) {
            vector<string> res;
	        string s;
	        generateParenthesis(s,0,0,n,res);
	        return res;
        }
};