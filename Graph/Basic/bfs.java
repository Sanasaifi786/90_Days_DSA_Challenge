import java.util.*;
public class bfs {
    public static void bfsTraversal(ArrayList<ArrayList<Integer>> graph, int startVertex) {
        boolean[] vis = new boolean[graph.size()];
        Queue<Integer> q = new LinkedList<>();

        // Mark the starting vertex as visited and enqueue it
        vis[startVertex] = true;
        q.add(startVertex);

        while(!q.isEmpty())
        {
            int curr = q.poll();
            System.out.print(curr + " ");

            for(int i=0; i<graph.get(curr).size(); i++)
            {
                if(!vis[graph.get(curr).get(i)])
                {
                    vis[graph.get(curr).get(i)] = true;
                    q.add(graph.get(curr).get(i));
                }
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

        // Perform BFS starting from vertex 0
        bfsTraversal(graph, 0);
    }
}
