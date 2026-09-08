
class Solution {
    public int[][] highestPeak(int[][] isWater) {
        
        int m=isWater.length;
        int n=isWater[0].length;
        int[][] height= new int[m][n];

        Queue<int[]> q= new LinkedList<>();

        int[][] direction = { {1,0}, {-1,0},{0,1}, {0,-1} };

           for(int i=0;i<isWater.length;i++){
              for(int j=0;j<isWater[0].length;j++){
                   if(isWater[i][j]==1){
                      height[i][j]=0;
                     q.offer(new int[]{i,j});
                   } 
                   else{
                    height[i][j]=-1;
                   }
              }
           }

        while(!q.isEmpty()){
            int[] curr =q.poll();
            int i=curr[0];
            int j=curr[1];
           
           for(int[]dir : direction){
                 int i_new = i+dir[0];
                 int j_new = j+dir[1];

                 if(i_new>=0 && j_new>=0 && i_new<m && j_new<n && height[i_new][j_new]==-1){
                    height[i_new][j_new]=height[i][j]+1;
                    q.offer(new int[]{i_new,j_new});}           
                                                      
                                                       } }

   return height;
        }

    }
