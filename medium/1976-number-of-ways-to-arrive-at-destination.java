class Pair{
    int node;
    long dist;
      
      Pair(int node,long dist){
        this.node=node;
        this.dist=dist; }
}


class Solution {
    public int countPaths(int n, int[][] roads) {
        
        int mod=1000000007;
     List<List<Pair>> adj= new ArrayList<>();

      for(int i=0;i<n;i++) {adj.add(new ArrayList<>());}

      for(int[]edge: roads){
         int u=edge[0];
         int v=edge[1];
         int w=edge[2];
                   
                adj.get(u).add(new Pair(v,w));
                adj.get(v).add(new Pair(u,w));   }

        long[]  dist= new long[n];
        Arrays.fill(dist,Long.MAX_VALUE);
        int [] freq= new int[n];
        freq[0]=1;

     PriorityQueue<Pair> pq= new PriorityQueue<>(
        (a, b) -> Long.compare(a.dist,b.dist));

        dist[0]=0;
        pq.offer(new Pair(0,0));

     while(!pq.isEmpty()){    
        Pair curr=pq.poll();
        int cn=curr.node;
        long cd=curr.dist;

         if(cd>dist[cn]) continue;

        for(Pair p:adj.get(cn)){
             
            int adjn=p.node;
            long adjd=p.dist;

            if(adjd+cd<dist[adjn]){
                dist[adjn]=adjd+cd;
                freq[adjn]=freq[cn];   
                pq.offer(new Pair(adjn,dist[adjn]));}

            else if(adjd+cd==dist[adjn]){
                freq[adjn]=(freq[adjn]+freq[cn])%mod;
            } 
                 } }

        return freq[n-1];
      }
    }
