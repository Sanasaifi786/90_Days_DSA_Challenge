import java.util.*;
public class bipartite {
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
        System.out.println(bfs(graph,0,color));
        
    }
}
