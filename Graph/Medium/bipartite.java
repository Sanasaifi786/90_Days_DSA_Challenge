import java.util.*;
public class bipartite {
    //using BFS to check if the graph is bipartite or not
    public static boolean bfs(int [][]graph, int start,int color[])
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0;
        while(!q.isEmpty())
        {
            int curr = q.poll();
            for(int i=0; i<graph[curr].length; i++)
            {
                if(curr == graph[curr][i])
                {
                    return false;
                }
                if(color[graph[curr][i]] == -1)
                {
                    color[graph[curr][i]] = 1 - color[curr];
                    q.add(graph[curr][i]);
                }
                else if(color[graph[curr][i]] == color[curr])
                {
                    return false;
                }
            }
        }
        return true;
    }
    //using DFS to check if the graph is bipartite or not 
    public static boolean dfs(int [][] graph, int start, int color[],int initial)
    {
        color[start] = initial;
        for(int i=0; i<graph[start].length; i++)
        {
            if(color[graph[start][i]]==-1)
            {
                if(!dfs(graph,graph[start][i],color,1-initial))
                {
                    return false;
                }
            }
            else if(color[i]==color[start])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // Problem name - Bipartite graph
        int [][] graph = {
            {1, 2},
            {0, 3},
            {0, 3},
            {1, 2}
        };
        int n = graph.length;
        int color[] = new int[n];
        Arrays.fill(color,-1);
        // System.out.println(bfs(graph,0,color));
        for(int i=0; i<n; i++)
        {
            if(color[i] == -1)
            {
                if(dfs(graph,i,color,0))
                {
                    System.out.println("The graph is bipartite");
                    return;
                }
            }
        }
        System.out.println("Not Bipartite");
    }
}
