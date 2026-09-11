class Pair{
   long min;
   long max;

   Pair(long min,long max){
    this.min=min;
    this.max=max;
   }

}

class Solution {
    int mod=1000000007;
    Pair[][]dp;
    public int maxProductPath(int[][] grid) {
     
    dp=new Pair[grid.length][grid[0].length];
   
    for(int i=0;i<grid.length;i++)Arrays.fill(dp[i], null);

    Pair ans=solve(0,0,grid);

    long big1=ans.min;
    long big2=ans.max;
    
    long ansn=Math.max(big1,big2)%mod;
    
    return (int) ((ansn<0)?-1:ansn%mod);}

   Pair solve(int i,int j,int[][] grid){
  
    //target
if(i==grid.length-1 && j==grid[0].length-1)return new Pair(grid[i][j], grid[i][j]);

     //end row   
    if(i==grid.length-1){

    Pair next=solve(i,j+1,grid);

    long a=(grid[i][j]*next.min);
    long b=(grid[i][j]*next.max);

    return dp[i][j]= new Pair(Math.min(a,b), Math.max(a,b)); }

    //end col
    if(j==grid[0].length-1){
    
    Pair next=solve(i+1,j,grid);

    long a=(grid[i][j]*next.min);
    long b=(grid[i][j]*next.max);

    return dp[i][j]= new Pair(Math.min(a,b),Math.max(a,b));  }


    if(dp[i][j]!= null)return dp[i][j];

    //rest

    Pair right=solve(i+1,j,grid);

    Pair bottom=solve(i,j+1,grid);
        
    long a=(grid[i][j]*right.min);
    long b=(grid[i][j]*right.max);
    long c=(grid[i][j]*bottom.max);
    long d=(grid[i][j]*bottom.min);

    long maxf=Math.max(Math.max(a,b),Math.max(c,d));
    long minf=Math.min(Math.min(a,b),Math.min(c,d));

  return dp[i][j]=new Pair(minf,maxf);
     
   }
}