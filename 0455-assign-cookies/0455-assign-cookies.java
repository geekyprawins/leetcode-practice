class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int sizeInd =0,greedInd=0;
        Arrays.sort(g);
        Arrays.sort(s);

        int m = s.length;
        int n = g.length;

        while(sizeInd<m && greedInd<n ){
            if(g[greedInd] <= s[sizeInd]){
                greedInd++;
            }
            sizeInd++;
        }
        return greedInd;
    }
}