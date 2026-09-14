class Solution {
    int[][] dp;
    int n;
    public int maxCollectedFruits(int[][] fruits) {
     
    n=fruits.length;
    dp= new int[n][n];

   for(int i=0;i<n;i++)Arrays.fill(dp[i],-1);

    int child1=col1(fruits);
    int child2=col2(0,n-1,fruits);
    int child3=col3(n-1,0,fruits);

    return child1+child2+child3;}

    int col1(int[][] fruits){
      
      int count=0;

      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
        if(i==j)count+=fruits[i][j];
        }
      }
    return count; }
    
    int col2(int i,int j,int[][] fruits){
     
    if(j<0 || i>=n || j>=n)return 0;

    if(i==n-1 && j==n-1)return 0;

    if(i==j || i>j) return 0;

    if(dp[i][j]!=-1)return dp[i][j];

    int bleft = fruits[i][j] + col2(i+1,j-1,fruits);
    int bdown = fruits[i][j] + col2(i+1,j,fruits);
    int bdiag =  fruits[i][j] + col2(i+1,j+1,fruits);
       
    return dp[i][j]=Math.max(Math.max(bleft,bdown),bdiag); }


int col3(int i,int j,int[][] fruits){
     
    if(i<0 || i>=n || j>=n)return 0;

    if(i==n-1 && j==n-1)return 0;

    if(i==j ||  j>i) return 0;

    if(dp[i][j]!=-1)return dp[i][j];

    int tright = fruits[i][j] + col3(i-1,j+1,fruits);
    int tup = fruits[i][j] + col3(i,j+1,fruits);
    int tdiag =  fruits[i][j] + col3(i+1,j+1,fruits);
       
    return dp[i][j]=Math.max(Math.max(tright,tup),tdiag); }


}