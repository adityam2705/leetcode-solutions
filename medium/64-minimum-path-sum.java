class Solution {
    int[][] dp;
    public int minPathSum(int[][] grid) {

     dp= new int[grid.length][grid[0].length];

     for(int i=0;i<grid.length;i++)Arrays.fill(dp[i],-1);

    return solve(0,0,grid);
    }

    int solve(int i,int j, int[][] grid){
     
     if(i==grid.length-1 && j==grid[0].length-1) return grid[i][j];

        if(dp[i][j]!=-1)return dp[i][j];   
     
     if(i==grid.length-1){return dp[i][j]=grid[i][j]+solve(i,j+1,grid);}

     if(j==grid[0].length-1){return dp[i][j]=grid[i][j]+solve(i+1,j,grid);}
     
     int right=solve(i+1,j,grid);

     int down=solve(i,j+1,grid);

     return dp[i][j]=grid[i][j]+Math.min(right,down);
    }
}