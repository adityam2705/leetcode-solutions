class Solution {
   int[][] directions ={{1,0},{-1,0},{0,1},{0,-1}};
    public int numIslands(char[][] grid) {

        int m=grid.length;
        int n=grid[0].length;
        
        int count=0;
        boolean[][] visited= new boolean[m][n];

        for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
             if(grid[i][j]=='1' && !visited[i][j]){
                dfs(i,j,visited,grid);
                count++;  }
                     }
                }
    return count;
    }

   void dfs(int i,int j,boolean[][] visited,char[][] grid){
      
         visited[i][j]=true;

        for(int[] dir:directions){
          int i_new =i+dir[0];
          int j_new = j+dir[1];

if( i_new>=0 && i_new<grid.length && j_new>=0 && j_new<grid[0].length && !visited[i_new][j_new] && grid[i_new][j_new]=='1'){
    dfs(i_new,j_new,visited,grid);}   }

   }
}