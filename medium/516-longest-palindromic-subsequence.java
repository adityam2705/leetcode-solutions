class Solution {
    public int longestPalindromeSubseq(String s) {
        
        int[][] dp=new int[s.length()][s.length()];
        int max=Integer.MIN_VALUE;

          for(int i=0;i<s.length();i++){
            dp[i][i]=1;}

        for(int L=2;L<=s.length();L++){
          for(int i=0;i<s.length()-L+1;i++){
           
           int j=L+i-1;

           if(s.charAt(i)==s.charAt(j)){
            dp[i][j]=2+dp[i+1][j-1];}

           else{
            dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);}

          }  
        }

        return dp[0][s.length()-1];
    }
}