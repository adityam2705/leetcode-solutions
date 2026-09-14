class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int m=image.length;
        int n=image[0].length;
      Queue<int[]> q = new LinkedList();
      int org=image[sr][sc];

 if(org==color)return image;

      q.offer(new int[]{sr,sc});
      image[sr][sc] = color;
     int[][] dir = {{0,1},{0,-1},{-1,0},{1,0}}; 
    
      while(!q.isEmpty()){

        int[] curr=q.poll();
            int x=curr[0];
            int y=curr[1];
           

          for(int[] d:dir){
              int i=x+d[0];
              int j=y+d[1]; 
              
            if(i>=0 && j>=0 && i<m && j<n && image[i][j]==org){
                q.offer(new int[]{i,j});
                image[i][j] = color;}   }


      }
      
return image;
    }
}