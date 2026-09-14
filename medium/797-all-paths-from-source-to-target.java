class Solution {
     List<List<Integer>> result= new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<List<Integer>> adj= new ArrayList<>();

     for(int i=0;i<graph.length;i++){
        adj.add(new ArrayList<>()); }

    for(int i=0;i<graph.length;i++){
      for(int j=0;j<graph[i].length;j++){
       adj.get(i).add(graph[i][j]);}}

       List<Integer> curr = new ArrayList<>();
       int target = graph.length-1;
 
           curr.add(0);
           dfs(0,adj,curr,target);
           

    return result;}

    void dfs(int u,List<List<Integer>> adj,List<Integer> curr, int target){
 
       if(u==target){
        result.add(new ArrayList<>(curr));}

        for(int v:adj.get(u)){

            curr.add(v);
            dfs(v,adj,curr,target);
            curr.remove(curr.size()-1);}


    }
}