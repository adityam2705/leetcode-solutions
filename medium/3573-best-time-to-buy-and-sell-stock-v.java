class Solution {
    long[][][] dp;
    public long maximumProfit(int[] prices, int k){

    dp=new long[prices.length][3][k+1];

    for(int i=0;i<prices.length;i++){
      for(int j=0;j<3;j++){
        Arrays.fill(dp[i][j],Long.MIN_VALUE);
      }
    }

    return solve(0,0,k,prices);
    }

    long solve(int i,int cond,int chase,int [] prices){

    if(i==prices.length || chase==0){
      if(cond==0)return 0;
      
      return Long.MIN_VALUE/2;}
     
    if(dp[i][cond][chase]!=Long.MIN_VALUE)return dp[i][cond][chase];

    if(cond==0){
       long buy=-prices[i]+solve(i+1,1,chase,prices);
       long notbuy=solve(i+1,0,chase,prices);
       long ssell=prices[i]+solve(i+1,2,chase,prices);
       
    return dp[i][cond][chase]=Math.max(Math.max(buy,notbuy),ssell);}

    else if(cond==1){

     long hold=solve(i+1,1,chase,prices);
     long sell=prices[i]+solve(i+1,0,chase-1,prices);

    return dp[i][cond][chase]=Math.max(hold,sell);}

    else{
       long bback=-prices[i]+solve(i+1,0,chase-1,prices);
       long hold=solve(i+1,2,chase,prices);

     return dp[i][cond][chase]=Math.max(hold,bback);}

    }

}