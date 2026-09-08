class Pair{

      int node;
      double dist;

      Pair(int node,double dist){
       this.node=node;
       this.dist=dist;  }

}


class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<Pair>> adj= new ArrayList<>();

        for(int i=0;i<n;i++){
           adj.add(new ArrayList<>());}

        for(int i=0;i<edges.length;i++){

          int u=edges[i][0];
          int v=edges[i][1];

          adj.get(u).add(new Pair(v,succProb[i]));
          adj.get(v).add(new Pair(u,succProb[i]));}

          double[] cost= new double[n];
          Arrays.fill(cost,0.0);

       PriorityQueue<Pair> pq= new PriorityQueue<>(
       (b,a)->Double.compare(a.dist,b.dist)

       );
         pq.offer(new Pair(start_node,1.0));
        
          cost[start_node]=1.0;

         while(!pq.isEmpty()){

           Pair curr=pq.poll();
           int node=curr.node;
           double dist=curr.dist;
              

        for(Pair p:adj.get(node)){

            int nodeadj=p.node;
            double distadj=p.dist;

          if(distadj*dist>cost[nodeadj]){
             cost[nodeadj]=distadj*dist;
             pq.offer(new Pair(nodeadj,cost[nodeadj]));}  }   }

        
     return (cost[end_node]==0.0)?0:cost[end_node];
    }
}