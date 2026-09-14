class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int i=0;
        int j=tokens.length-1;
        int max=0;
        int score=0;
        Arrays.sort(tokens);
    while(i<=j){
        if(power>=tokens[i]){
            power-=tokens[i];
            score++;
            max=Math.max(max,score);
            i++;}

        else{
             if(score>=1){
                score--;
                power+=tokens[j];
                j--;}   
              else{break;}}
              
              }

   return max; }
}