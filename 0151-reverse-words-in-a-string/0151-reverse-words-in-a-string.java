class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length()-1;

        while(i>=0){
            //skip trailing spaces
            while(i>=0 && s.charAt(i) == ' ') i--;
            if(i<0) break;

            int end = i;

            while(i>=0 && s.charAt(i) != ' ') i--;

            String word = s.substring(i+1,end+1);

            if(result.length() > 0) result.append(" ");

            result.append(word);

        }

        return result.toString();

    }
}