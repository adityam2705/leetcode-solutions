class Solution {
    int ans=0;
    int [][] directions = {{-1,0},{0,-1},{0,1},{1,0}};
    public int islandPerimeter(int[][] grid) {
            
       boolean[][] visited = new boolean[grid.length][grid[0].length];     

      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
           if(grid[i][j]==1){dfs(i,j,grid,visited);
           return ans;}
        }
      }

    return 0;
    }

    void dfs(int i, int j, int[][] grid,boolean[][] visited){
     
     visited[i][j]=true;

     for(int[] d:directions){
       
       int inew=i+d[0];
       int jnew=j+d[1];
       
if(inew<0 || jnew<0 || inew>=grid.length || jnew>=grid[0].length||grid[inew][jnew]==0 ){ans++;}

if(inew<0 || jnew<0 || inew>=grid.length || jnew>=grid[0].length|| grid[inew][jnew]==0 || visited[inew][jnew]){ continue;}   

     
    
     dfs(inew,jnew,grid,visited);}
    }
}