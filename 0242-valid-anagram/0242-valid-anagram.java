class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] charFreq = new int[26];

        for(int i=0; i<s.length();i++) charFreq[s.charAt(i)-'a']++;
        for(int i=0; i<t.length();i++) charFreq[t.charAt(i)-'a']--;

        for(int c : charFreq){
            if(c!=0) return false;
        }
        return true;
    }
}