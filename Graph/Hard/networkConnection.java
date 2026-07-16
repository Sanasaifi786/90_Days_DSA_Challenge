import java.util.ArrayList;

public class networkConnection {
    public static class DisjointSet{
    ArrayList<Integer> parent  = new ArrayList<>();
    ArrayList<Integer> rank = new ArrayList<>();
    public DisjointSet(int n)
    {
        for(int i=0;i<n;i++)
        {
            parent.add(i);
            rank.add(0);
        }
    }
    public int find(int x)
    {
        if(parent.get(x)==x)
        {
            return x;
        }
        parent.set(x, find(parent.get(x)));
        return parent.get(x);
    }
    public void union(int x, int y)
    {
        int px = find(x);
        int py = find(y);
        if(px == py)
        {
            return;
        }
        if(rank.get(px) < rank.get(py))
        {
            parent.set(px, py);
        }
        else if(rank.get(px) > rank.get(py))
        {
            parent.set(py, px);
        }
        else
        {
            parent.set(py, px);
            rank.set(px, rank.get(px) + 1);
        }
    }
}
    public static int makeConnected(int n, int[][] connections) {
        DisjointSet dsu = new DisjointSet(n);
        int extraEdge = 0;
        for(int node[]: connections)
        {
            int u = node[0];
            int v = node[1];
            if(dsu.find(u)==dsu.find(v))
            {
                extraEdge++;
            }
            else{
                dsu.union(u,v);
            }
        }
        int countComponent = 0;
        for(int i=0; i<dsu.parent.size(); i++)
        {
            if(dsu.parent.get(i)==i)
            {
                countComponent++;
            }
        }
        if(extraEdge>=countComponent-1)
        {
            return countComponent-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        // Problem Name - 1319. Number of Operations to Make Network Connected
        // Problem Link - https://leetcode.com/problems/number-of-operations-to-make-network-connected/
        int n = 4;
        int[][] connections = {{0,1},{0,2},{1,2}};
        System.out.println("Minimum number of operations to connect all computers: " + makeConnected(n, connections));
    }
}
