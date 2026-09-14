class Solution {
    int[] parent;
    int[] rank;
    public long countPairs(int n, int[][] edges) {
        parent = new int[n];
        rank= new int[n];

        for(int i=0;i<n;i++)parent[i]=i;

// component
        for(int[]edge:edges){
            union(edge[0],edge[1],parent ,rank);

        }

//map
       HashMap<Integer,Integer> map= new HashMap<>();

       for(int i=0;i<n;i++){
         map.put(find(i,parent),map.getOrDefault(parent[i],0)+1);}

      long  result=0;
      long rem=n;

       for(int value : map.values()){
          int size= value;
        result+= size *(rem-size);
        rem=rem-size;
       }
return result;
    }



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