class Solution {
    int[][] directions={{-1,0},{0,-1},{0,1},{1,0}};

    public int minimumObstacles(int[][] grid) {

       int n=grid.length;
       int m=grid[0].length;
 
        int[][] price=new int[n][m];

        for(int i=0;i<n;i++)
        Arrays.fill(price[i],Integer.MAX_VALUE);
     
      PriorityQueue<int[]> pq= new PriorityQueue<>(
        (a,b)->Integer.compare(a[2],b[2])
      );

         pq.offer(new int[]{0,0,0});

         while(!pq.isEmpty()){
          
          int[] curr=pq.poll();
          int x=curr[0];
          int y=curr[1];
          int cost=curr[2];

        for(int[] dir:directions){
         
         int xnew=x+dir[0];
         int ynew=y+dir[1];

        if(xnew<0 || ynew<0 || xnew>=n || ynew>=m) continue;
          
          int costnew=grid[xnew][ynew];
     
        if(costnew+cost<price[xnew][ynew]){
            price[xnew][ynew]=costnew+cost;
        pq.offer(new int[]{xnew,ynew,price[xnew][ynew]});}}
            

         }

    return price[n-1][m-1]; 
    }
}