class Pair{
  int node;
  int min;
  int max;
  int cost;

   Pair(int node,int min,int max,int cost){
    this.node=node;
    this.min=min;
    this.max=max;
    this.cost=cost; }   }

class Solution {
    public int minTime(int n, int[][] edges) {

    if(n==1)return 0; 

    List<List<Pair>> adj= new ArrayList<>();

      for(int i=0;i<n;i++){
         adj.add(new ArrayList<>());}     

      for(int[] edge:edges){
        int u=edge[0];
        int v=edge[1];
        int start=edge[2];
        int end=edge[3];

        adj.get(u).add(new Pair(v,start,end,0));}

        PriorityQueue<Pair> pq= new PriorityQueue<>(
          (a,b)->Integer.compare(a.cost,b.cost)
        );

        pq.offer(new Pair(0,0,0,0));

        int[] price= new int[n];
        Arrays.fill(price,Integer.MAX_VALUE);
           
           price[0]=0;

        while(!pq.isEmpty()){

           Pair curr=pq.poll();
           int u=curr.node;
           int cost=curr.cost;

           if(u==n-1)return cost;

          for(Pair p:adj.get(u)){

           int adjn=p.node;
           int start=p.min;
           int end=p.max;

            if(cost>end)continue;
   
       int costadj= Math.max(cost, start) + 1;              
       

       if(costadj<price[adjn]){
           price[adjn]=costadj;
           pq.offer(new Pair(adjn,start,end,price[adjn]));} } }

 
   return -1;
       }
}