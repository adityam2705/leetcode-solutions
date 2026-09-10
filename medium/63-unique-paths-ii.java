class Solution {
      int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        
    for(int i=0;i<m;i++){
     for(int j=0;j<n;j++){
      
      if(obstacleGrid[i][j]==1){
        obstacleGrid[i][j]=-2;
        continue;}
    
      obstacleGrid[i][j]=-1;
       }
     }
  
    dp=new int[m][n];

    for(int i=0;i<m;i++)Arrays.fill(dp[i],-1);

   return solve(0,0,obstacleGrid);
    }

    int solve(int i,int j,int[][] grid){

        if(i>=grid.length || j>=grid[0].length){return 0;}

        if(grid[i][j]==-2){return 0;}

        if(i==grid.length-1 && j==grid[0].length-1)return 1;

        if(dp[i][j]!=-1)return dp[i][j];
  
        int right=solve(i+1,j,grid);

        int down=solve(i,j+1,grid);

        return dp[i][j]=right+down;

    }
}