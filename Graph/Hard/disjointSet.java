import java.util.ArrayList;
public class disjointSet {
    public static class DisjointSet{
    ArrayList<Integer> parent  = new ArrayList<>();
    ArrayList<Integer> rank = new ArrayList<>();
    ArrayList<Integer> size = new ArrayList<>();
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

    public void unionBySize(int x, int y)
    {
        int px = find(x);
        int py = find(y);
        if(px==py)
        {
            return;
        }
        if(size.get(px)<size.get(y))
        {
            parent.set(px,py);
            size.set(py,size.get(py)+size.get(px));
        }
        else{
            parent.set(py,px);
            size.set(px,size.get(px)+size.get(py));
        }
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
    public static void main(String[] args)
    {
        DisjointSet dsu = new DisjointSet(6);
        dsu.union(0,2);
        dsu.find(2);
        dsu.union(1,3);
        dsu.union(2,5);
        dsu.union(0,3);
        dsu.find(2);
        dsu.union(0,4);
    }
}
