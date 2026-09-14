class Solution {
    int count=0;
    public int maxAreaOfIsland(int[][] grid) {
      
      int max=0;
      int m=grid.length;
      int n=grid[0].length;
      
boolean[][] visited=new boolean[m][n];
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
   if(!visited[i][j] && grid[i][j] 
    ==1 ){
        dfs(i, j, visited, grid);
        max=Math.max(count,max);
        count=0;
    }
        
        }
      }
        
    return max;   
        
    }
    
  void dfs(int i, int j, boolean [][]visited,int [][] grid){
     
      
if(i>=grid.length || j>=grid[0].length ||i<0 || j<0 || visited[i][j]|| grid[i][j]==0)return;

    count++;
    visited[i][j]=true;
    dfs(i+1,j,visited,grid);
    dfs(i-1,j,visited,grid);
    dfs(i,j-1,visited,grid);
    dfs(i,j+1,visited,grid);

      
      
  }
}