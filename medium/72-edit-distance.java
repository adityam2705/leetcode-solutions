class Solution {
    int[][] dp;
    public int minDistance(String word1, String word2) {
   
    int m=word1.length();
    int n=word2.length(); 

    dp= new int[m+1][n+1];
    
    for(int i=m;i>=0;i--){
      for(int j=n;j>=0;j--){

        if(i==m){ dp[i][j]=n-j;
        continue;}

        if(j==n){ dp[i][j]=m-i;
        continue;}

        if(word1.charAt(i)==word2.charAt(j)){dp[i][j]=dp[i+1][j+1];}

        else{dp[i][j]=1+Math.min(Math.min(dp[i+1][j],dp[i][j+1]),dp[i+1][j+1]);}

        }
    }


   return dp[0][0];
    }
}