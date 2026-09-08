class Solution {
    public boolean isBipartite(int[][] graph) {
         int V=graph.length;
         int[] coloured = new int[V];
     for(int i=0;i<V;i++){
         if(coloured[i]==0){
             if(bipartite(graph,coloured,i,1)==false)
                    return false;
         } 
         
      }
       return true;
    }
    
   boolean bipartite(int[][] graph,int[] coloured,int curr, int color){
       
                coloured[curr]=color;
       
       for(int v:graph[curr]){
           
           if(coloured[v]==0){
             coloured[v]=3-color;
             if(bipartite(graph,coloured,v,coloured[v])==false)return false;
           }
            
            if(coloured[v]==color){
                return false;}
           
       }
       return true;
   } 
}