class Solution {
   class Pair {
        int effort;
        int row;
        int col;

        Pair(int effort, int row, int col) {
            this.effort = effort;
            this.row = row;
            this.col = col;
        }
    }
    public int minimumEffortPath(int[][] heights) {
       int m=heights.length;
       int n=heights[0].length;

       int[][] dist = new int[m][n];
       int[][] dir = new int[][]{{-1,0},{0,-1},{0,1},{1,0}};
       for(int i=0;i<m;i++){Arrays.fill(dist[i], Integer.MAX_VALUE);}

      PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.effort - b.effort);
             
       pq.offer(new Pair(0,0,0));
       dist[0][0] = 0;


       while(!pq.isEmpty()){
          Pair curr=pq.poll();
          
          int effort=curr.effort;
          int row=curr.row;
          int col=curr.col;

         if(row==m-1 && col==n-1)return effort;

         if(effort>dist[row][col])continue;

         for(int[] d: dir){
           int nr=row+d[0];
           int nc=col+d[1];

         if(nr<0||nc<0||nr>=m||nc>=n) continue;

        int edge=Math.abs(heights[row][col] - heights[nr][nc]);
        int newEffort=Math.max(effort,edge);

        if(newEffort<dist[nr][nc]) {
         dist[nr][nc] =newEffort;
         pq.offer(new Pair(newEffort, nr, nc)); }
             }}
     return 0;        
    }
}