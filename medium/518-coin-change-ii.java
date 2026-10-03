class Solution {
   int[][]dp;
    public int change(int amount, int[] coins) {

   dp=new int[coins.length][amount+1];

    for(int i=0;i<coins.length;i++){
        Arrays.fill(dp[i],-1);}

    return solve(0,coins,amount,0);  
    }

    int solve(int i,int[] coins,int amount,int sum){

    if(sum>amount || i==coins.length)return 0;
    
    if(sum==amount)return 1;
    
    if(dp[i][sum]!=-1)return dp[i][sum];

    int take=solve(i,coins,amount,sum+coins[i]);
    int nottake=solve(i+1,coins,amount,sum);

    return dp[i][sum]=take+nottake;
    }
}