class Solution {
public:
    vector<int> getRow(int rowIndex) {
        
        vector<vector<int>> rows(rowIndex+1);
        for(int i=0; i<rowIndex+1; i++){
            rows[i].resize(i+1, 1);
            for(int j=1; j<rows[i].size()-1; j++){
                rows[i][j] = rows[i-1][j-1]+rows[i-1][j];
            }
        }
        return rows[rowIndex];
    
    }
};