class Pair {
    int node;
    int cost;

    Pair(int node, int cost) {
        this.node = node;
        this.cost = cost;
    }
}
class Solution {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
       List<List<Pair>> adj= new ArrayList<>();
   
       for(int i=0;i<n;i++){adj.add(new ArrayList<>());}
 
      for(int i=0;i<flights.length;i++){
         int u=flights[i][0];
         int v=flights[i][1];
         int wt=flights[i][2];

           adj.get(u).add(new Pair(v,wt));      }

        int[] distn= new int[n];
        Arrays.fill(distn,Integer.MAX_VALUE);
        
        Queue<Pair> pq = new LinkedList<>();

        distn[src]=0;
        pq.offer(new Pair(src,0));

        int level=0;

    while(!pq.isEmpty() && level<=k){

       int size=pq.size();
       level++;
       
       for(int i=0;i<size;i++){
          Pair curr=pq.poll();
          int cn=curr.node;
          int co=curr.cost;
               
          for(Pair p:adj.get(cn)){
             int adjnode=p.node;
             int adjd=p.cost;

             if(co+adjd<distn[adjnode]){
                 distn[adjnode]=co+adjd;
                pq.offer(new Pair(adjnode,distn[adjnode]));  } 
                
                } }
        }

    return (distn[dst]==Integer.MAX_VALUE)? -1:distn[dst];        
    }
}