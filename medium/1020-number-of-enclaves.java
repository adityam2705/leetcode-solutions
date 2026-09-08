class Solution {
    public int numEnclaves(int[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited= new boolean[m][n];
      
    
for(int i=0;i<n;i++) {
    if(!visited[0][i] && grid[0][i] == 1) {
        dfs(0, i, visited, grid);
    }
}

for(int i=0;i<m;i++){
    if(!visited[i][0] && grid[i][0] == 1) {
        dfs(i, 0, visited, grid);
    }
}

for(int i=0;i<m;i++){
    if(!visited[i][n-1] && grid[i][n-1] == 1) {
        dfs(i, n-1, visited, grid);
    }
}


for(int i=0;i<n;i++) {
    if(!visited[m-1][i] && grid[m-1][i] == 1) {
        dfs(m-1, i, visited, grid);
    }
}

        for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
            if(grid[i][j]==1 && visited[i][j]==false){
                count++;
            }
          }
        }
 
 return count;
    }

 void dfs(int i, int j,boolean[][] visited,int[][] grid ){

   if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j] || grid[i][j]==0)  return;

    visited[i][j]=true;
    
    dfs(i+1,j,visited,grid);
    dfs(i-1,j,visited,grid);
    dfs(i,j+1,visited,grid);
    dfs(i,j-1,visited,grid);}

}