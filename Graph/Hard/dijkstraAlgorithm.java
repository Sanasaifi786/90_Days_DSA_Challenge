import java.util.*;
public class dijkstraAlgorithm {
    static class Pair {
        int vertex;
        int weight;
        Pair(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }
    public static void main(String[] args) {
        //Problem name - Dijkstra's Algorithm using priority Queue
        int graph[][] = {
            {0, 4, 0, 0, 0, 0},
            {4, 0, 2, 5, 0, 0},
            {0, 2, 0, 0, 3, 0},
            {0, 5, 0, 0, 1, 2},
            {0, 0, 3, 1, 0, 6},
            {0, 0, 0, 2, 6, 0}
        };
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        int n = graph.length;
        int []dist = new int[n];
        for(int i=0; i<n; i++)
        {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[0] = 0;
        pq.add(new Pair(0,0));
        while(!pq.isEmpty())
        {
            int weight = pq.peek().weight;
            int ver = pq.peek().vertex;
            pq.remove();
            for(int i=0; i<graph[ver].length; i++)
            {
                int adjWeight = graph[ver][i];
                if(dist[ver] + adjWeight< dist[i])
                {
                    dist[i] = dist[ver] + adjWeight;
                    pq.add(new Pair(i, dist[i]));
                }
            }
        }
        for(int i=0; i<dist.length; i++)
        {
            System.out.println("Distance from source to vertex " + i + " is: " + dist[i]);
        }

    }
}
