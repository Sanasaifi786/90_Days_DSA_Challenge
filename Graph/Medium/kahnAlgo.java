import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class kahnAlgo {
    public static void main(String[] args) {
        // Number of vertices
        int V = 6;

        // Create adjacency list for the graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges
        adj.get(5).add(0);
        adj.get(5).add(2);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        int[] indegree = new int[V];

        // Loop over all vertices to calculate in-degree
        for (int i = 0; i < V; i++) {
            // Loop over all adjacent vertices of current vertex
            for (int it : adj.get(i)) {
                // Increase in-degree of connected vertex
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<V; i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        while(!q.isEmpty())
        {
            int node = q.poll();
            System.out.println(node);
            for(Integer i: adj.get(node))
            {
                if(indegree[i]!=0)
                {
                    indegree[i]--;
                }
                if(indegree[i]==0)
                {
                    q.add(i);
                }
            }
        }
    }
}
