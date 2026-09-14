class Pair{
    int node;
    int dist;
    Pair(int node,int dist){
      this.node=node;
      this.dist=dist;}
}

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
    
    ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

    for(int i = 0; i <= n; i++) {
    adj.add(new ArrayList<>());}

   for(int[] edge : times) {
       int u = edge[0];
       int v = edge[1];
       int wt = edge[2];

       adj.get(u).add(new Pair(v, wt));}


    TreeSet<Pair> set = new TreeSet<>((a,b)->
      {if(a.dist!=b.dist)return Integer.compare(a.dist, b.dist);
      return Integer.compare(a.node,b.node);});

    int []dist = new int[n+1];
    Arrays.fill(dist,Integer.MAX_VALUE);
    dist[k] = 0;
    set.add(new Pair(k,0));

    while(!set.isEmpty()){
       Pair curr=set.pollFirst();
       int d = curr.dist;
       int node = curr.node;

     if(d>dist[node]) continue;

     for(Pair p:adj.get(node)){
  
         int adjnode=p.node;
         int wt=p.dist;

         if(d+wt<dist[adjnode]){

          if(dist[adjnode] != Integer.MAX_VALUE)  set.remove(new Pair(adjnode,dist[adjnode]));
            
            dist[adjnode]=d+wt;
            set.add(new Pair(adjnode,dist[adjnode]));  }     }  } 
   
          int max=0;

    for(int i=1;i<=n;i++){
     if(dist[i]==Integer.MAX_VALUE) return -1;

     max=Math.max(max,dist[i]);
    }

return max;
    }
}