class Solution {
    int N;
    int M;
    int K;
    int MOD = 1000000007;
    int [][][] dp;
    public int numOfArrays(int n, int m, int k) {
     
     dp= new int[n+1][k+1][m+1];
     N=n;
     M=m;
     K=k;

     for(int[][] a: dp){
       for(int[] b : a){
        Arrays.fill(b, -1);}}
    

     return solve(0,0,0);}

    int solve(int idx,int cost,int max){
         
         if(cost > K)return 0;

    if(idx==N){return cost == K ? 1 : 0;}

     int result=0;

     if(dp[idx][cost][max]!=-1) return dp[idx][cost][max];

    for(int i=1;i<=M;i++){
        if(i>max){
         result=(result + solve(idx+1,cost+1,i))%MOD; }
        else{
            result=(result +solve(idx+1,cost,max))%MOD;} }
   
    return dp[idx][cost][max]= result%MOD; }

}