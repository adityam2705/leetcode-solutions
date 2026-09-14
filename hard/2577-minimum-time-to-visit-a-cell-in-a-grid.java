class Solution {
    public int minimumTime(int[][] grid) {

      int m=grid.length;
      int n=grid[0].length;

     int[][] directions= {{0,1},{1,0},{0,-1},{-1,0}};

     PriorityQueue<int[]> q= new PriorityQueue<>(
        (a,b)->Integer.compare(a[2],b[2])
     );

     q.offer(new int[]{0,0,0});

           if(m>1 && n>1 && grid[0][1]>1 && grid[1][0]>1)return -1;

        int[][] dist = new int[m][n];

        for(int[] row:dist)Arrays.fill(row, Integer.MAX_VALUE);
             
             dist[0][0] = 0;

       while(!q.isEmpty()){
        
        int[] curr= q.poll();

        int x=curr[0];
        int y=curr[1];
        int time=curr[2];

        if(x==m-1 && y==n-1)return time;

        if(time!=dist[x][y]) continue;

        for(int[] dir:directions){

            int newx=x+dir[0];
            int newy=y+dir[1];

        if(newx<0 || newy<0|| newx>=m || newy>=n )continue;        

             int nextTime=time + 1;

            if(nextTime<grid[newx][newy]){
                int diff=grid[newx][newy]-nextTime;

                if(diff%2==0)nextTime=grid[newx][newy];
                else nextTime = grid[newx][newy] + 1;}

             if(nextTime < dist[newx][newy]){
                dist[newx][newy]=nextTime;
          q.offer(new int[]{newx,newy,nextTime});}    }}

        
        return -1;
    }
}