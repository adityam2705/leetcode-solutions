class Solution {
    int max = 0;

    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] freq = new int[26];

        for(char ch : letters) {
        freq[ch - 'a']++;}
        backtrack(words, score, freq, 0, 0);
        return max;
    }

    void backtrack(String[] words, int[] score, int[] freq,int idx, int currScore) {
        if (idx == words.length) {
            max = Math.max(max, currScore);
            return;
        }

        // Skip 
        backtrack(words, score, freq, idx + 1, currScore);

        //  take
        String word = words[idx];
        int wordScore = 0;
        boolean possible = true;

        for (char ch : word.toCharArray()) {
            freq[ch - 'a']--;

            if (freq[ch - 'a'] < 0) {
                possible = false;
            }

            wordScore += score[ch - 'a'];
        }

        if(possible){
            backtrack(words, score, freq,idx + 1, currScore + wordScore);}

        // Restore frequencies
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }
    }
}