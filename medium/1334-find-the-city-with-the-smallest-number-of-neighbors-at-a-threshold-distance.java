class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        
        int ans=0;
        int INF = 1000000000;
        int min=Integer.MAX_VALUE;
      int[][] grid=new int[n][n];

    for(int i=0;i<grid.length;i++){
        Arrays.fill(grid[i],INF);
         grid[i][i]=0;  }

     for(int[]edge : edges){
        int u=edge[0];
        int v=edge[1];
        int wt=edge[2];

        grid[u][v]=wt;
        grid[v][u]=wt;}

      for(int via=0;via<n;via++){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              
              grid[i][j]=Math.min(grid[i][j],grid[i][via]+ grid[via][j]);
                 }
            }
        }

     for(int i=0;i<grid.length;i++){
          int count=0;
        for(int j=0;j<grid[0].length;j++){
        
           if(grid[i][j]<=distanceThreshold){
            count++;}   }
        
        if(count<=min){
            min=count;
          ans=i;
        }

     }
  return ans;        
    }
}