class Solution {
    int[] c;
    int[][] dp;
    public int minCost(int n, int[] cuts) {

    Arrays.sort(cuts);
    c=new int[cuts.length+2];
    dp=new int[c.length][c.length];
    
    c[0]=0;
    c[c.length-1]=n;
    for(int i=0;i<cuts.length;i++){
      c[i+1]=cuts[i];}
    
    for(int i=0;i<dp.length;i++){
        Arrays.fill(dp[i],-1);}

    return solve(0,c.length-1); 
    }

    int solve(int i,int j){

    if(j-i==1)return 0;

    if(dp[i][j]!=-1)return dp[i][j];
    int ans=Integer.MAX_VALUE;

   for(int k=i+1;k<j;k++){
    int cut=c[j]-c[i]+solve(i,k)+solve(k,j);
    
    ans=Math.min(ans,cut);} 

    return dp[i][j]=ans;
    }
}