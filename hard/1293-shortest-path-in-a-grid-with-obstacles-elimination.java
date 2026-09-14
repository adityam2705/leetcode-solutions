class Solution {
    
    int[][] directions={{-1,0},{0,-1},{0,1},{1,0}};

    public int shortestPath(int[][] grid, int k) {
       
       int level=0;
       int n=grid.length;
       int m=grid[0].length;
 
        int[][] price=new int[n][m];

        for(int i=0;i<n;i++)
        Arrays.fill(price[i],Integer.MAX_VALUE);
         
         price[0][0]=0;
    Queue<int[]> pq= new LinkedList<>();
         
        pq.offer(new int[]{0,0,0});

       while(!pq.isEmpty()){
          
            int size=pq.size();
       
        for(int i=0;i<size;i++){
              
          int[] curr=pq.poll();
          int x=curr[0];
          int y=curr[1];
          int rem=curr[2];
        
        
        if(x==n-1 && y==m-1){ return level;}

        if(rem>k)continue;

      for(int[] dir:directions){
             
         int xnew=x+dir[0];
         int ynew=y+dir[1];
        
        if(xnew<0 || ynew<0 || xnew>=n || ynew>=m) continue;
          
           int newrem=rem;
          if(grid[xnew][ynew]==1){newrem=rem+1;}    

          if(newrem < price[xnew][ynew]){
            price[xnew][ynew] = newrem;
            pq.offer(new int[]{xnew, ynew, newrem});}

                 } }
               
               level++;
              }
            

    return -1;  
    }
}