class Solution {
     int[] disc;
     int[] low;
    int time = 1;
    List<List<Integer>> bridges= new ArrayList<>();
     List<List<Integer>> adj= new ArrayList<>();
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
 
       for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());}

        for(List<Integer> it:connections ){
          int u=it.get(0);
          int v=it.get(1);

        adj.get(v).add(u);
        adj.get(u).add(v);}

         disc= new int[n];
         low=new int[n];

     bridges= new ArrayList<>();
    dfs(0,-1);
    return bridges;
    }

    public void dfs(int curr, int prev) {
        disc[curr]=low[curr]=time++;
        for(int next : adj.get(curr)) {
            if(disc[next] == 0){
                dfs(next,curr);
                low[curr]=Math.min(low[curr], low[next]);}
                 else if(next!=prev)
                low[curr] = Math.min(low[curr], disc[next]);
            if(low[next]>disc[curr]) 
                bridges.add(Arrays.asList(curr, next));}
    }
}