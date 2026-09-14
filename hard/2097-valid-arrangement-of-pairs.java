class Solution {
    public int[][] validArrangement(int[][] pairs) {
        
       int[][] result = new int[pairs.length][2];
       List<Integer> list= new ArrayList<>();
       HashMap<Integer, Integer> indegree = new HashMap<>();
       HashMap<Integer, Integer> outdegree = new HashMap<>();
       HashMap<Integer,List<Integer>> adj= new HashMap<>();
       
      
        for(int[]edge : pairs){
            int u=edge[0];
            int v=edge[1];
           
            adj.computeIfAbsent(u,k-> new ArrayList<>()).add(v);

           outdegree.put(u,outdegree.getOrDefault(u, 0) + 1);
           indegree.put(v,indegree.getOrDefault(v, 0) + 1);}
          
             int start=pairs[0][0];

         for(int node : outdegree.keySet()){
            int out = outdegree.getOrDefault(node, 0);
            int in = indegree.getOrDefault(node, 0);

         if(out-in==1){
            start=node;
                break;}}
    
         dfs(adj,start,list);
         int j=0;

         for(int i=list.size()-1;i>0;i--){
             result[j][0]=list.get(i);          
             result[j][1]=list.get(i-1);
             j++; }

    return result;
    }

    void dfs(Map<Integer, List<Integer>> adj,int start,List<Integer> list){

            while(adj.containsKey(start) &&!adj.get(start).isEmpty()){
        
                int next=adj.get(start).remove(adj.get(start).size()-1);
                dfs(adj,next,list);
            }

        list.add(start);
         
    }
}