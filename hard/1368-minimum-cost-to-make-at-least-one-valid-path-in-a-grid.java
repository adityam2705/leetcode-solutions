class Pair{
    int x;
    int y;
    int cost;
   
   Pair(int x,int y,int cost){
    this.x=x;
    this.y=y;
    this.cost=cost;
    }
}

class Solution {
    public int minCost(int[][] grid) {
   
    int m=grid.length;
    int n=grid[0].length;
    PriorityQueue<Pair> pq=new PriorityQueue<>(
        (a,b)->Integer.compare(a.cost,b.cost)
    );

    int[][] dist = new int[m][n];

    for(int i=0;i<m;i++)Arrays.fill(dist[i], Integer.MAX_VALUE);

    dist[0][0] = 0;

    int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
    pq.offer(new Pair(0,0,0));

    while(!pq.isEmpty()){

      Pair curr=pq.poll();
       int i=curr.x;
       int j=curr.y;
       int cost=curr.cost;
       
        if(cost>dist[i][j])continue;
        
       if(i==m-1 && j==n-1)return cost;
   
       for(int d=0;d<4;d++){

        int ni =i+dir[d][0];
        int nj =j+dir[d][1];
         
      if(ni>=0 && ni<m && nj>=0 && nj<n){
           int newcost;

        if(grid[i][j]==d+1)newcost=cost;
 
        else{newcost=cost+1;} 

      if(newcost<dist[ni][nj]){
        dist[ni][nj] = newcost;
        pq.offer(new Pair(ni,nj,newcost));}
                       } } }

    return -1;    }
}