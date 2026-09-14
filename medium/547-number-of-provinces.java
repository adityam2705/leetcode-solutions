class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        Map<Integer, List<Integer>> adj = new HashMap<>();
        boolean[] visited = new boolean[n+1];

        int count = 0;
        for (int i = 1; i <= n; i++) {
            adj.put(i, new ArrayList<>());}

        for(int i = 0; i < n; i++) {
           for(int j = 0; j < n; j++) {
             if ( isConnected[i][j] == 1) {
               adj.get(i + 1).add(j + 1);}
                          }
                     }

        for (int i = 1; i<=n; i++) {
            if (!visited[i] ) {
                dfs(adj, visited, i);
                count++;
            }
        }

        return count;
    }

    void dfs(Map<Integer, List<Integer>> adj, boolean[] visited, int u) {

        visited[u] = true;

        for (int v:adj.get(u)) {
            if (!visited[v]) {
                dfs(adj, visited, v);
            }
        }

    }
}