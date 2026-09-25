class Solution {
    int[][][] dp;
    public int maxProfit(int[] prices) {
        
      dp=new int[prices.length][2][2];

      for(int i=0;i<prices.length;i++){
       for(int j=0;j<2;j++){
        Arrays.fill(dp[i][j],-1);
       }
      }

     return solve(0,1,1,prices);
    }

    int solve(int i,int cond,int chase,int[] prices){

    if(i==prices.length || chase<0 )return 0;

    if(dp[i][cond][chase]!=-1)return dp[i][cond][chase];
    
    if(cond==1){
      int buy=-prices[i]+solve(i+1,0,chase,prices);
      int nobuy=solve(i+1,1,chase,prices);
      
      return dp[i][cond][chase]=Math.max(buy,nobuy);}

    else{
     int sell=prices[i]+solve(i+1,1,chase-1,prices);
     int nosell=solve(i+1,0,chase,prices);

     return dp[i][cond][chase]=Math.max(sell,nosell);
    }


    }
}