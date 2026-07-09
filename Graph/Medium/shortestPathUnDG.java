import java.util.LinkedList;
import java.util.Queue;

public class shortestPathUnDG {
    public static void main(String[] args) {
        //problem name - Shortest path distance in undirected graph
        int graph[][] = {
            {1,3},
            {0,2,3},
            {1,6},
            {0,4},
            {3,5},
            {4,6},
            {2,5,7,8},
            {6,8},
            {6,7}
        };
        int dist[] = new int[graph.length];
        for(int i=0; i<graph.length; i++)
        {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[0] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty())
        {
            int node = q.poll();
            for(int i=0; i<graph[node].length; i++)
            {
                if(dist[node]+1<dist[graph[node][i]])
                {
                    dist[graph[node][i]] = dist[node]+1;
                    q.add(graph[node][i]);
                }
            }
        }
        for(int i=0; i<graph.length; i++)
        {
            System.out.println(dist[i]+" ");
        }
    }
}
