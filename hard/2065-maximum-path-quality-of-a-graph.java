class Pair{
   int x;
   int y;
   
   Pair(int x,int y){
       this.x=x; 
       this.y=y;}
    
}

class Solution {
    
    int max=0;

public int maximalPathQuality(int[] values, int[][] edges, int maxTime) {
        
 List<List<Pair>> adj = new ArrayList<>();
      
 for(int i=0;i<values.length;i++){adj.add(new ArrayList<>());}
        
 for(int i=0;i<edges.length;i++){
       int u=edges[i][0];
       int v=edges[i][1];
       int wt=edges[i][2];
       
    adj.get(u).add(new Pair(v,wt));
    adj.get(v).add(new Pair(u,wt));   }

  int val=values[0];

  values[0]=0; 
  dfs(0,values,adj,maxTime,val,0);
  
 return max;
     
    }
    
  void dfs(int u, int[] values, List<List<Pair>> adj,int k,int curr, int time){
      
    if(time>k){return;}
      
    if(u==0){max=Math.max(curr,max);}
      
    for(Pair p : adj.get(u)){

        int v=p.x;
        int wt=p.y;
        int val=values[v];
        values[v]=0;

    dfs(v,values,adj,k,curr+val,time+wt); 
        values[v] = val;

    }
      
      
      
  }
}