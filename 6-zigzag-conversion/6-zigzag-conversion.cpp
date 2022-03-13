class Solution {
public:
    string convert(string s, int numRows) {
        int nRows = numRows;
        if (nRows <= 1)
            return s;

        vector<string> zigzag(nRows, "");
        int len = s.size();
        int state = 0, row = 0;
        for (int i = 0; i < len;) {
            if (state == 0) {
                // go down
                zigzag[row++] += s[i++];
                if (row == nRows) {
                    row = nRows - 2;
                    state = 1; // go up
                }
            } else {
                // state == 1
                // go up
                // row from 1 to nRows - 2
                if (row >= 1) {
                    zigzag[row--] += s[i++];
                    if (row == 0)
                        state = 0;
                } else {
                    row = 0;
                    state = 0;
                }
            }
        }
        string res;
        for (vector<string>::iterator it = zigzag.begin(); it != zigzag.end(); it++) {
            res += *it;
        }
        return res;
    }
};