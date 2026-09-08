class Solution {
    int [][]dp;
    public int minInsertions(String s) {
        
       int n=s.length();
       dp=new int[n][n];

      for(int L=1;L<=n;L++){
       for(int i=0;i+L-1<n;i++){

        int j=i+L-1;

        if(i==j)dp[i][j]=0;

        else if(s.charAt(i)==s.charAt(j)){dp[i][j]=dp[i+1][j-1];}

        else{
          dp[i][j]=1+Math.min(dp[i+1][j],dp[i][j-1]); }
       }
      }

    return dp[0][n-1]; 
    }
}