class Solution {
    int[][] dp;
    public int minDistance(String word1, String word2) {
    
    int a=word1.length();
    int b=word2.length();
    
    dp=new int[a][b];
 
    for(int i=0;i<a;i++)Arrays.fill(dp[i],-1);

return a+b-solve(a-1,b-1,word1,word2);
    }

    int solve(int i,int j,String s1,String s2){

       if(i<0 || j<0)return 0;
       
       if(dp[i][j]!=-1)return dp[i][j];

        int same=0;
       if(s1.charAt(i)==s2.charAt(j)){
        same=2+solve(i-1,j-1,s1,s2);}

       int notsame=Math.max(solve(i-1,j,s1,s2),solve(i,j-1,s1,s2));

        return dp[i][j]=Math.max(same,notsame);
    }
}