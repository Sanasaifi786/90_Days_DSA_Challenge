import java.util.ArrayList;
import java.util.List;

public class allPathSrcToDes {
    public static void allPath(int[][] graph,int src,int dest,List<Integer> inner,List<List<Integer>> outer)
    {
        inner.add(src);
        if(src==dest)
        {
            outer.add(new ArrayList<>(inner));
        }
        for(int i=0; i<graph[src].length; i++)
        {
            allPath(graph,graph[src][i],dest,inner,outer);
        }
        inner.remove(inner.size()-1);
    }
    public static void main(String[] args) {
        int graph[][] = {
            {1,2},
            {3},
            {3},
            {}
        };
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        int src  = 0;
        int dest = graph.length-1;
        allPath(graph,src,dest,inner,outer);
        System.out.println(outer);
    }
}
