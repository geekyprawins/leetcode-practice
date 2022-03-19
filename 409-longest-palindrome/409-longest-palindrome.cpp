class Solution {
public:
    int longestPalindrome(string s) {
        unordered_map<char,int> umap;
        
        for( char c : s ){
            umap[c]++;
        }
        
        
        int rem = 0;
        int maxl = 0;
        
        
        for( auto itr = umap.begin(); itr != umap.end(); itr++ ){
            
            if( rem == 0 && itr->second%2 == 1 ){
                rem++;
            }
            
            maxl += itr->second - itr->second%2;
        }
        
        return maxl+rem ;
    }
};