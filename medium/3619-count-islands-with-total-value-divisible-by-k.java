class Solution {
    long count=0;
    public int countIslands(int[][] grid, int k) {
        
         int ans=0;
         int m=grid.length;
         int n=grid[0].length;
        
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            count=0;
          if(grid[i][j]!=0){
            dfs(i,j,grid);
            if(count%k==0){ans++;}
            }
        }
      }

   return ans;
    }

   void dfs(int i,int j,int[][] grid){

    if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0) return;
       
       count+=(long)grid[i][j];
       grid[i][j]=0;
       
       dfs(i+1,j,grid);
       dfs(i-1,j,grid);
       dfs(i,j+1,grid);
       dfs(i,j-1,grid);

   }
}