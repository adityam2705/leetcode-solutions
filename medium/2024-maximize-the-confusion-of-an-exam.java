class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int[] freq = new int[128];
        int max = 0;
        int left = 0;


        for (int right = 0; right < answerKey.length(); right++) {
            char r = answerKey.charAt(right);
            freq[r - 'A']++;

            while (Math.min(freq['T'-'A'],freq['F'-'A'])>k) {
                char l = answerKey.charAt(left);

                freq[l - 'A']--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}