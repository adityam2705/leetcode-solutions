class Solution {
    int [][] directions={{-1,0},{0,-1},{0,1},{1,0}};

    public int minTimeToReach(int[][] moveTime) {
          
          int m=moveTime.length;
          int n=moveTime[0].length;
    PriorityQueue<int[]> pq= new PriorityQueue<>(
        (a,b)->Integer.compare(a[2],b[2])
    );

        int[][] price= new int[m][n];
        for(int i=0;i<m;i++)
        Arrays.fill(price[i],Integer.MAX_VALUE);

           pq.offer(new int[]{0,0,0});

         price[0][0]=0;

      while(!pq.isEmpty()){

         int[] curr=pq.poll();
         int x=curr[0];
         int y=curr[1];
         int cost=curr[2];

         if(x==m-1&&y==n-1)return cost;

        if(cost>price[x][y])continue;

        for(int[] dir:directions){

           int xnew=x+dir[0];
           int ynew=y+dir[1];
     
     if(xnew <0 || xnew>=m || ynew <0 || ynew>=n) continue;
         
         int costnew=Math.max(moveTime[xnew][ynew],cost)+1;

        if(costnew<price[xnew][ynew]){
           price[xnew][ynew]=costnew;
           pq.offer(new int[]{xnew,ynew,price[xnew][ynew]}); }}}

    return price[m-1][n-1];
    }
}