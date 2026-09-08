class Solution {
    int[]parent;
    int[]rank;
    public int makeConnected(int n, int[][] connections) {
        parent = new int[n];
        rank= new int[n];
        int compon=n;
        for(int i=0;i<n;i++){parent[i]=i;}

    if(connections.length<n-1)return -1;
    for(int[] comp:connections){

       if(find(comp[0], parent) != find(comp[1], parent)){
             union(comp[0],comp[1],parent,rank);
                 compon--;}

        }
return compon-1;    }



    void union(int x, int y, int[] parent, int[] rank){
      int parentx=find(x,parent);
      int parenty= find(y,parent);

      if(parentx==parenty)return;

      if(rank[parentx]>rank[parenty]){
            parent[parenty]=parentx;}

      else if(rank[parenty]>rank[parentx]){
            parent[parentx]=parenty;}

        else{
            parent[parentx]=parenty;
            rank[parenty]+=1; }

    }

    int find(int i, int[]parent){

        if(i==parent[i]) return i;

        return parent[i]=find(parent[i],parent);
    }
}