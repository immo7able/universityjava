import java.sql.Array;
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 1},
                {0, 2},
                {3, 5},
                {5,4},
                {4,3},
        };
        System.out.println(validPath(6,arr, 0, 5));
    }
    public static Set<Integer> visited = new HashSet<>();
    public static Map<Integer, List<Integer>> graph = new HashMap<>();
    public static boolean found = false;
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        if(edges.length == 0) return true;
        for(int[] edge: edges) {
            int u = edge[0];
            int v = edge[1];
            graph.putIfAbsent(u, new ArrayList<>());
            graph.get(u).add(v);
            graph.putIfAbsent(v, new ArrayList<>());
            graph.get(v).add(u);
        }
        dfs(source, destination);
        return found;
    }
    public static void dfs(int node, int destination) {
        if(node == destination) {
            found = true;
        }
        visited.add(node);
        for(int neighbor: graph.get(node)) {
            if(!visited.contains(neighbor)) {
                dfs(neighbor, destination);
            }
        }
    }
}