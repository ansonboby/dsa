import java.util.*;

List<Integer> bfs(List<List<Integer>> g, int start) {
    int n = g.size();
    boolean[] vis = new boolean[n];
    List<Integer> order = new ArrayList<>();
    Queue<Integer> q = new LinkedList<>();
    q.offer(start);
    vis[start] = true;
    while (!q.isEmpty()) {
        int u = q.poll();
        order.add(u);
        for (int v : g.get(u)) {
            if (!vis[v]) {
                vis[v] = true;
                q.offer(v);
            }
        }
    }
    return order;
}

void dfs(List<List<Integer>> g, int u, boolean[] vis, List<Integer> order) {
    vis[u] = true;
    order.add(u);
    for (int v : g.get(u))
        if (!vis[v]) dfs(g, v, vis, order);
}
