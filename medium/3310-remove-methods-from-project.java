class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        
       boolean [] visited = new boolean[n];
       boolean [] visited2 = new boolean[n];
       boolean [] marked = new boolean[n];

    List<Integer>[] adj = new ArrayList[n];;
    List<Integer> result = new ArrayList<>();

    for(int i=0;i<n;i++){
        adj[i]= new ArrayList<>();}

    for(int[]edge :invocations){
        int u=edge[0];
        int v=edge[1];
        adj[u].add(v);}

     dfs(k,adj,marked,visited);

    for(int i=0;i<n;i++){
        if(visited2[i]==false && marked[i]==false){
            checkneigbor(i,adj,marked,visited2);
        }
    }

    for(int i=0;i<n;i++){
        if(!marked[i]){
            result.add(i);
        }
    }

return result;
    }

void dfs(int u, List<Integer>[] adj,boolean [] marked ,boolean [] visited){
 
       if(visited[u])return;
       
       visited[u]=true;
       marked[u]=true;

       for(int v:adj[u]){
           if(!visited[v]){
            dfs(v,adj,marked,visited);}
       }}

void checkneigbor(int u, List<Integer>[] adj,boolean [] marked ,boolean [] visited2){
      
       for(int v:adj[u]){
       if(marked[v]==true) Arrays.fill(marked,false);

       }
    }
}