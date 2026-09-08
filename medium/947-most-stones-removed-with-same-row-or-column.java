class Solution {
    public int removeStones(int[][] stones) {
        
        int count=0;
    boolean[] visited= new boolean[stones.length];

        for(int i=0;i<stones.length;i++){
            if(!visited[i]){
                dfs(i,visited,stones);
                 count++;
            }
            
        }
 
     return stones.length-count;
    }


    void dfs(int j,boolean[] visited, int[][] stones){

               visited[j]=true;
        for(int i=0;i<stones.length;i++){
              if( !visited[i] && (stones[i][0]==stones[j][0] || stones[i][1]==stones[j][1]) ){
                   dfs(i,visited,stones);
              }            
           }


    }
}