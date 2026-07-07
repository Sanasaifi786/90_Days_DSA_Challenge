import java.util.ArrayList;
import java.util.Stack;

public class topologicalSort {
    public static void dfs(ArrayList<ArrayList<Integer>> adj, int start, Stack<Integer> s, boolean vis[])
    {
        vis[start] = true;
        for(Integer i: adj.get(start))
        {
            if(!vis[i])
            {
                dfs(adj,i,s,vis);
            }
        }
        s.push(start);
    }
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

        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];
        for(int i=0; i<V; i++)
        {
            if(!vis[i])
            {
                dfs(adj,i,s,vis);
            }
        }
        //printing the topological sort
        while(!s.isEmpty())
        {
            System.out.print(s.pop()+" ");
        }
    }
}
