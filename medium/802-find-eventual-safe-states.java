class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> reverse = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<n;i++)
            reverse.add(new ArrayList<>());

        int[] outDegree = new int[n];

        for(int u=0;u<n;u++){
            outDegree[u] = graph[u].length;
            for(int v : graph[u]) {
                reverse.get(v).add(u);} }
       
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            if(outDegree[i]==0)
                q.offer(i);}
            
            boolean[] safe = new boolean[n];

        while(!q.isEmpty()){
            int node = q.poll();
            safe[node] = true;

            for(int parent:reverse.get(node)) {
                outDegree[parent]--;
                if(outDegree[parent]==0)
                    q.offer(parent);} }

           for (int i = 0; i < n; i++) {
            if (safe[i])
                ans.add(i);}
                
        return ans;}
}