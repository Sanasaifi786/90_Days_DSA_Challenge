import java.util.*;
public class dfs {
    public static void dfsTraversal(ArrayList<ArrayList<Integer>> graph, int i, boolean[] vis) {
        // Mark the current vertex as visited
        vis[i] = true;
        System.out.print(i + " ");

        // Recur for all the vertices adjacent to this vertex
        for (int j = 0; j < graph.get(i).size(); j++) {
            int curr = graph.get(i).get(j);
            if (!vis[curr]) {
                dfsTraversal(graph, curr, vis);
            }
        }
    }
    public static void main(String[] args) {
        // Create a graph using an adjacency list representation
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int vertices = 5; // Number of vertices in the graph

        // Initialize the graph with empty lists for each vertex
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Adding edges to the graph
        graph.get(0).add(1);
        graph.get(1).add(0);
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(2).add(1);
        graph.get(2).add(4);
        graph.get(2).add(3);
        graph.get(3).add(1);
        graph.get(3).add(2);
        graph.get(4).add(2);

        // Perform DFS starting from vertex 0
        boolean[] vis = new boolean[graph.size()];
        dfsTraversal(graph, 0, vis);
    }
}
