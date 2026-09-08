class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
     
boolean[] visited = new boolean[n]; 
      HashMap<Integer,List<Integer>>adj = new HashMap<>();
      
      for(int i=0;i<n;i++){
         adj.put(i,new ArrayList<>()); }
      
      for(int[]edge:edges){
          int u=edge[0];
          int v=edge[1];
          adj.get(u).add(v);
          adj.get(v).add(u);}
          
return dfs(adj, visited, source, destination);
          
    }
    
    boolean dfs(HashMap<Integer,List<Integer>>adj,boolean[] visited,int u, int ans){
        
       if(ans==u)return true;
         visited[u]=true;
       for(int v: adj.get(u)){if(!visited[v] && dfs(adj,visited,v,ans))return true;
           
       }
   return false; }
}