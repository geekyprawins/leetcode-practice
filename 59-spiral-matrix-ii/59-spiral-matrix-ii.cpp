class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        vector<vector<int>> v(n, vector<int>(n, 0));
        int k=1;
        int sr=0, sc=0, er=n-1, ec=n-1;
        
        while(sr<=er and sc<=ec){
            for(int i=sc; i<=ec; i++){
                v[sr][i] = k++;
            }
            sr++;
            for(int i=sr; i<=er; i++){
                v[i][ec] = k++;
            }
            ec--;
            for(int i=ec; i>=sc; i--){
                v[er][i] = k++;
            }
            er--;
            for(int i=er; i>=sr; i--){
                v[i][sc] = k++;
            }
            sc++;
        }
        return v;
    }
};