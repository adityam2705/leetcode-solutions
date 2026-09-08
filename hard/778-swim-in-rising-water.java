class Pair{

      int x;
      int y;
      int cost;

      Pair(int x,int y, int cost){
         this.x=x;
         this.y=y;
         this.cost=cost; }
}


class Solution {
    int[][] directions ={{0,1},{0,-1},{-1,0},{1,0}};
    public int swimInWater(int[][] grid) {

                                    
        int n=grid.length;
          
        int[] dist = new int[n*n];
       Arrays.fill(dist, Integer.MAX_VALUE);  
       PriorityQueue<Pair> pq= new  PriorityQueue<>(
        (a,b) -> Integer.compare(a.cost,b.cost)
       );

        pq.offer(new Pair(0,0,grid[0][0]));
        dist[0] = grid[0][0];

        while(!pq.isEmpty()){
         Pair curr=pq.poll();
             int i=curr.x;
             int j=curr.y;
             int wt=curr.cost;
             
             if(wt>dist[i * n + j]) continue;     
             if(i==n-1 && j==n-1) return wt;
             
            
           for(int[]d : directions){
             int inew=i+d[0];
             int jnew=j+d[1];
            
        if(inew<0 || inew>=grid.length || jnew<0 || jnew>=grid[0].length )continue;
            
              int newCost=Math.max(wt, grid[inew][jnew]);

              if(newCost<dist[inew*n+jnew]){
                  dist[inew*n+jnew]=newCost;
              pq.offer(new Pair(inew,jnew,dist[inew*n+jnew]));
                  }
               }   
        }
  
  return -1;
    }
}