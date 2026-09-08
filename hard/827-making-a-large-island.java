class Solution {
    int count=0;
    int id=2;
    public int largestIsland(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        int max=Integer.MIN_VALUE;
        int newArea=0;

          int[] area = new int[m * n + 2];
         
         int[][] directions={{-1,0},{1,0},{0,1},{0,-1}};

         for(int a=0;a<m;a++){
          for(int b=0;b<n;b++){
            if(grid[a][b]==1){
               dfs(a,b,grid);
               area[id] = count;
               id++;               
               count=0; } 
                   }
                 }

      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
 
            if(grid[i][j]==0){   
                Set<Integer> set = new HashSet<>();
             
              for(int[]dir:directions){
                  int xnew=i+dir[0];
                  int ynew=j+dir[1];

            if(xnew<0 || ynew<0 || xnew>=grid.length || ynew>=grid[0].length)continue;
                  
                  set.add(grid[xnew][ynew]);}  

              for(int ide:set) {
                newArea+=area[ide];} 

                max=Math.max(max,newArea+1);}

                newArea=0; } 
                }

  if(max==Integer.MIN_VALUE) return m*n;

return max;
    }


    void dfs(int i,int j,int[][] grid){

        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!=1)return;
            

            grid[i][j]=id;
            count++;
         dfs(i+1,j,grid);
         dfs(i-1,j,grid);
         dfs(i,j+1,grid);
         dfs(i,j-1,grid);

    }
}