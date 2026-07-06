public class detectCycle {
    public static boolean dfs(int graph[][],int start, boolean vis[], int parent)
    {
        vis[start] = true;
        for(int i = 0; i<graph[start].length; i++)
        {
            if(!vis[graph[start][i]])
            {
                if(dfs(graph,graph[start][i],vis,start))
                {
                    return true;
                }
                if(i!=parent)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int graph[][] = {
            {2,3},
            {1,5},
            {1,4,6},
            {3},
            {2,7},
            {3,7},
            {5,6}
        };
        int n = graph.length;
        boolean vis[] = new boolean[n];
        for(int i=0; i<n; i++)
        {
            if(!vis[i])
            {
                if(dfs(graph,i,vis,-1))
                {
                    System.out.println("Cycle is present");
                    return;
                }
            }
        }
        System.out.print("Cycle is not present");
    }
}
