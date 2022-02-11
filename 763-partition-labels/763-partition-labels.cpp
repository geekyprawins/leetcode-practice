class Solution {
public:
    vector<int> partitionLabels(string s) {
        vector<int> ans;
        vector<int> lastPos(26,0);
		// Storing the last occurance
        for(int i=0;i<s.size();i++) lastPos[s[i]-'a']=i;
        int partitionLenght=0,lastOccurance=-1;
        for(int i=0;i<s.size();i++){
            int curr=lastPos[s[i]-'a'];
			// last impact of each char
            lastOccurance=max(lastOccurance,curr);
            partitionLenght++;
			// it can be our partition so store the length
            if(lastOccurance==i){
                ans.push_back(partitionLenght);
				// reset the variables
                partitionLenght=0;
                lastOccurance=-1;
            }
        }
        return ans;
    }
};