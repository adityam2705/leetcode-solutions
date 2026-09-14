class Solution {
    int comp=0;
    public int countCompleteComponents(int n, int[][] edges) {
        HashMap<Integer,List<Integer>>  adj = new HashMap<>();
           
        for(int i=0;i<n;i++){
            adj.put(i,new ArrayList<>());}

        for(int []edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);}

        int count=0;
        boolean[] visited = new boolean[n];

        for(int i=0;i<n;i++){
             if(!visited[i]){
                List<Integer> component = new ArrayList<>();

               traverse(adj,visited,i,component); 
              
               int size = component.size();
                boolean complete = true;
                   
            for(int v:component){
                if(adj.get(v).size()!=size-1){
                    complete = false;
                    break;
                }
            }
          
          if(complete)count++;
 }}

        return count;
    }

    void traverse(HashMap<Integer,List<Integer>>  adj,boolean[] visited,int u, List<Integer> component){
    
         
           visited[u]=true;
           component.add(u);
 
              for(int v:adj.get(u)){
                  if(!visited[v]){
                     traverse(adj,visited,v,component);}  }

    }
}