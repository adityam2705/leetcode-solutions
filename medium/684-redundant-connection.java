class Solution {
    int[] parent;
    public int[] findRedundantConnection(int[][] edges) {
         
         int n=edges.length;
         List<List<Integer>> adj= new ArrayList<>();
        parent= new int[n+1];

        for(int i=1;i<=n;i++){
            parent[i] = i;}

        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];

          int pu=find(u);
          int pv=find(v);
          
          if(pu==pv){
            return edges[i];}
            
            parent[pu]=pv;}

          return edges[0]; 
    }

   int find(int x){

    if(parent[x]==x)return x;

    return parent[x]=find(parent[x]);}
}