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
        for(int i=0; i<n; i++)
        {
            if(!vis[i])
            {
                if(dfs(graph,i,vis,pathVis))
                {
                    System.out.println("Present Cycle");
                    return;
                }
            }
        }
        System.out.println("Not Present Cycle");
    }
}
