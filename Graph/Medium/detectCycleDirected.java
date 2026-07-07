import java.util.LinkedList;
import java.util.Queue;

public class detectCycleDirected {
    public static boolean dfs(int[][] graph, int start, boolean[] vis,boolean[] pathVis)
    {
        vis[start] = true;
        pathVis[start] = true;
        for(int i=0; i<graph[start].length; i++)
        {
            if(!vis[graph[start][i]])
            {
                if(dfs(graph,graph[start][i], vis,pathVis))
                {
                    return true;
                }
            }
            else if(pathVis[graph[start][i]] && vis[graph[start][i]])
            {
                return true;
            }
        }
        pathVis[start] = false;
        return false;
    }
    public static void bfs(int graph[][],int V)
    {
        int[] indegree = new int[V];

        // Loop over all vertices to calculate in-degree
        for (int i = 0; i < V; i++) {
            // Loop over all adjacent vertices of current vertex
            for (int it=0; i<graph[i].length; i++) {
                // Increase in-degree of connected vertex
                indegree[graph[i][it]]++;
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
        int count = 0;
        while(!q.isEmpty())
        {
            int node = q.poll();
            count++;
            for(int i=0; i<graph[node].length; i++)
            {
                if(indegree[graph[node][i]]!=0)
                {
                    indegree[graph[node][i]]--;
                }
                if(indegree[graph[node][i]]==0)
                {
                    q.add(i);
                }
            }
        }
        if(count!=V)
        {
            System.out.println("Present cycle");
        }
        else{
            System.out.println("cycle not present");
        }
    }
    public static void main(String[] args)
    {
        int graph[][] = {
            {2},
            {5},
            {1,4},
            {},
            {7},
            {3},
            {6}
        };
        int n = graph.length;
        boolean vis[] = new boolean[n];
        boolean pathVis[] = new boolean[n];
        //using DFS
        // for(int i=0; i<n; i++)
        // {
        //     if(!vis[i])
        //     {
        //         if(dfs(graph,i,vis,pathVis))
        //         {
        //             System.out.println("Present Cycle");
        //             return;
        //         }
        //     }
        // }
        // System.out.println("Not Present Cycle");

        // using BFS
        bfs(graph,n);
    }
}
