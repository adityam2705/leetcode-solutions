class Solution {
    long[][] dp;
    long inf=Long.MAX_VALUE/2;
    public int coinChange(int[] coins, int amount) {

    dp=new long[coins.length][amount+1];

    for(int i=0;i<coins.length;i++){
      Arrays.fill(dp[i],-1);}

    long ans=solve(0,0,amount,coins);

    return (ans<inf)?(int)ans:-1;
    }

    long solve(int i,int curr,int amount,int[] coins){

    if(curr>amount || i==coins.length|| curr<0) return inf;
     
    if(curr==amount)return 0;
    
    if(dp[i][curr]!=-1)return dp[i][curr];

    long ktake=1+solve(i,curr+coins[i],amount,coins);
    long nottake=solve(i+1,curr,amount,coins);

    return dp[i][curr]=Math.min(ktake,nottake);}
}