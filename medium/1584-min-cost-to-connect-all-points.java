 class Edge{
        int u, v, wt;
        Edge(int u, int v, int wt) {
            this.u = u;
            this.v = v;
            this.wt = wt;}}

class Solution {
    public int minCostConnectPoints(int[][] points) {
        
     List<Edge> adj= new ArrayList<>();

     int n=points.length;

      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
             int x1=points[i][0];
             int y1=points[i][1];

             int x2=points[j][0];
             int y2=points[j][1];

         int dist=Math.abs(x2-x1)+Math.abs(y2-y1);

            adj.add(new Edge(i,j,dist)); } }

        Collections.sort(adj, (a, b) -> a.wt - b.wt);

       int[] parent = new int[n];
       int[] rank = new int[n];

        for (int i=0;i<n;i++)
            parent[i] = i;

        int cost=0;
        int edgesUsed=0;

        for(Edge e:adj) {

            if(find(e.u,parent) != find(e.v,parent)) {

                union(e.u, e.v,parent,rank);
                cost += e.wt;
                edgesUsed++;

                if (edgesUsed==n-1)
                    break;
            }
        }
   return cost;  }

    int find(int x,int[] parent) {
        if(parent[x] == x)
            return x;
        return parent[x] = find(parent[x],parent);
    }

    void union(int x, int y,int[] parent,int[] rank) {
        int px = find(x,parent);
        int py = find(y,parent);

        if (px == py)
            return;

        if (rank[px] < rank[py]) {
            parent[px] = py;
        } else if (rank[px] > rank[py]) {
            parent[py] = px;
        } else {
            parent[py] = px;
            rank[px]++;
        }
    }
    }
