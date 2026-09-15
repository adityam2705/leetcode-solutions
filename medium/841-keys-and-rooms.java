class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

    int n=rooms.size();

    boolean [] vis= new boolean[n];
    dfs(0,rooms,vis);

    for(int i=1;i<vis.length;i++){
        
        if(vis[i]==false){return false;}
             }         

    return true;
    }

    void dfs(int u,List<List<Integer>> rooms,boolean [] vis){

    if(vis[u]){return;}

       vis[u]=true;

       for(int curr:rooms.get(u)){
      
        dfs(curr,rooms,vis);
        
        }
    }

}