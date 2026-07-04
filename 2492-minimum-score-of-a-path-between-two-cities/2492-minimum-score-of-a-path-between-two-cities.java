class Solution {
    private int ans = Integer.MAX_VALUE;
    public int minScore(int n, int[][] roads) {
        List<int[]>[] graph = new ArrayList[n + 1];
        for(int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int[] road : roads) {
            int u = road[0], v = road[1], d = road[2];
            graph[u].add(new int[] {v, d});
            graph[v].add(new int[] {u, d});
        }
        boolean[] visited = new boolean[n+1];
        dfs(1, graph, visited);
        return ans;
    }
    private void dfs(int node, List<int[]>[] graph, boolean[] visited) {
        visited[node] = true;
        for(int[] edge : graph[node]) {
            int next = edge[0];
            int w = edge[1];
            ans = Math.min(ans, w);
            if(!visited[next]) dfs(next, graph, visited);
        }
    }
}