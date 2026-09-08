class Solution {
    int n;
    int stx;
    int sty;
    int m;
    int result;
    int poss;
 int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
    public int uniquePathsIII(int[][] grid) {
        n=grid[0].length;
        m=grid.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                   if(grid[i][j]==0){ poss++; }
                   if(grid[i][j]==1){ poss++;
                      stx=i;
                      sty=j; }    }     }
      
           solve(grid,stx,sty,0);
              return result; }

    void solve(int[][]grid ,int i, int j, int count){
         if(i<0|| j<0|| j>=n || i>=m) return;
         if(grid[i][j] == -1) return;
         if(grid[i][j]==2 && count==poss){
                 result++;
                   return; }

                   int temp = grid[i][j];
                     grid[i][j] = -1;

         for(int[] dir : directions){
            int i_ = i + dir[0];
            int j_ = j + dir[1];
                  
             solve(grid,i_,j_,count+1); }
                 grid[i][j]=temp;
    }
}