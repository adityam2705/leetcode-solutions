class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        HashMap<Integer,List<Integer>> adj = new HashMap<>();
        int[]indegree = new int[numCourses];
        for(int i=0;i<numCourses;i++){
           adj.put(i,new ArrayList<>());}

        for(int[] edge:prerequisites){
            int u=edge[1];
            int v=edge[0];
            adj.get(u).add(v);
            indegree[v]++;}
        
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0)q.offer(i); }

        while(!q.isEmpty()){
            int u=q.poll();
            result.add(u);
        for(int v:adj.get(u)){
            indegree[v]--;
           if(indegree[v]==0) q.offer(v);}   }

        int[] ans = new int[result.size()];

        for(int i=0;i<result.size();i++){
             ans[i]=result.get(i);}

     if(ans.length==numCourses)return ans;

     return new int[0];
    }
}