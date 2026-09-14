class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,List<Integer>> adj = new HashMap<>();
        int[] indegree = new int[numCourses];
        Queue<Integer> q= new LinkedList<>();
        
        for (int i = 0; i < numCourses; i++) {
             adj.put(i, new ArrayList<>());}

        for(int[]pair:prerequisites){
            int u=pair[1];
            int v=pair[0];
            adj.get(u).add(v);
            indegree[v]++;}

        

           
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.offer(i);    } } 

    List<Integer> result= new ArrayList<>();
        while(!q.isEmpty()){
            int u=q.poll();
            result.add(u);
           for(int v:adj.get(u)){
               indegree[v]--;
               if(indegree[v]==0){q.offer(v); }}  }   


       if(result.size()==numCourses)return true;
         return false;


    }
}