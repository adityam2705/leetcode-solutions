class Pair {
    int node;
    int time;
    int cost;

    Pair(int node, int time, int cost) {
        this.node = node;
        this.time = time;
        this.cost = cost;
    }
}

class Solution {
    public int minCost(int maxTime, int[][] edges, int[] passingFees) {
        
      int n=passingFees.length;

      List<List<Pair>> adj= new ArrayList<>();
 
      PriorityQueue<Pair> pq= new PriorityQueue<>(
        (a,b)->Integer.compare(a.cost,b.cost)
      );
 
      int[][] price=new int[n][maxTime+1];
      for(int i=0;i<n;i++)
      Arrays.fill(price[i],Integer.MAX_VALUE);

      for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());}

      for(int []edge:edges){
        int u=edge[0];
        int v=edge[1];
        int wt=edge[2];

        adj.get(u).add(new Pair(v,wt,0));
        adj.get(v).add(new Pair(u,wt,0));}

          pq.offer(new Pair(0,0,passingFees[0]));
          price[0][0]=passingFees[0];

        while(!pq.isEmpty()){
   
          Pair curr= pq.poll();
          int currn=curr.node;
          int currt=curr.time;
          int currc=curr.cost;
             
             if(currn==n-1){return currc;}

            if(currc > price[currn][currt]){continue;}

          for(Pair v:adj.get(currn)){
    
            int adjn=v.node;
            int adjt=v.time;

            int newTime = currt + adjt;

            if(newTime>maxTime) continue;

            int adjc=currc+passingFees[adjn];

        if(adjc< price[adjn][newTime]){
            
            price[adjn][newTime]=adjc;
            pq.offer(new Pair(adjn,newTime,adjc));} } }


    return -1;
    }
}