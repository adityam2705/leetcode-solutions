class Solution {
    public String answerString(String word, int numFriends) {
     if(numFriends == 1) return word;

        int n= word.length();
        int len= n - numFriends + 1;

        int i=0,j=1,k=0;

        while(j+k<n){
            char a = word.charAt(i + k);
            char b = word.charAt(j + k);

            if (a == b) {
                k++;
            } else if (a < b) {
                i = Math.max(i + k + 1, j);
                j = i + 1;
                k = 0;
            } else {
                j = j + k + 1;
                k = 0;
            }
        }

        return word.substring(i, Math.min(n, i + len));
    }
}