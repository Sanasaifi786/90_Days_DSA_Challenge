
import java.util.ArrayList;

public class constructionOfGraph {
    public static void main(String[] args) {
        // Creating a graph using ArrayList of ArrayList
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int vertices = 5; // Number of vertices in the graph

        // Initializing the graph with empty lists for each vertex
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

        System.out.println("Graph representation using adjacency list:");
        System.out.println(graph);
    }
}
