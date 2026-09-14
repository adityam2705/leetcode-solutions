class Pair{
      int x;
      int y;
      Pair(int x,int y){
         this.x=x;
         this.y=y;}
}

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
 int[][] dir = {{-1, -1},{-1, 0},{-1, 1},{0, -1},{0, 1},{1, -1},{1, 0},{1, 1}};
 int n=grid.length;

  if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1; }

    Queue<Pair> q = new ArrayDeque<>();

     
       q.offer(new Pair(0,0));
       grid[0][0]=1;

        int path=0;

       while(!q.isEmpty()){
             int N=q.size();
          for (int i = 0; i < N; i++){
                Pair curr=q.poll();
            int hor=curr.x;
            int ver=curr.y;

          if(hor== n-1 && ver==n-1) return path+1;
  
   for (int[] d : dir) {
    int nr = hor + d[0];
    int nc = ver + d[1];

    if (nr >= 0 && nr < n && nc >= 0 && nc < n && grid[nr][nc]==0) {
        q.offer(new Pair(nr,nc)); 
        grid[nr][nc] = 1;  } }  }
                  path++;}

return -1;

    }
}