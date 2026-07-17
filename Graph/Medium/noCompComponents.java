import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class noCompComponents {
    public static boolean bfs(List<List<Integer>> adj,int i,boolean vis[])
    {
        Queue<Integer> q = new LinkedList<>();
        vis[i] = true;
        q.add(i);
        int vertex = 1;
        int edge = 0;
        while(!q.isEmpty())
        {
            int node = q.poll();

            for(Integer j: adj.get(node))
            {
                edge++;
                if(!vis[j])
                {
                    vis[j] = true;
                    vertex++;
                    q.add(j);
                }
            }
        }
        int totalEdge = edge/2;
        // System.out.println("vertex "+vertex + " "+ "edge "+ totalEdge);
        int n = vertex*(vertex-1)/2;
        if(totalEdge==n)
        {
            return true;
        }
        return false;

    }
    public static int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>(n);
        for(int i=0; i<n; i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i<edges.length; i++)
        {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean vis[] = new boolean[n];
        int count = 0;
        for(int i=0; i<n; i++)
        {
            if(!vis[i])
            {
                if(bfs(adj,i,vis)==true)
                {
                    count++;
                }
            }
        }
        // System.out.println(adj);
        return count;
    }
    public static void main(String[] args) {
        //Problem Name: 2685. Count the Number of Complete Components
        int n = 6;
        int[][] edges = {{0,1},{0,2},{1,2},{3,4}};
        System.out.println(countCompleteComponents(n,edges));
    }
}
