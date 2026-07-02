import java.util.LinkedList;
import java.util.Queue;

public class noOfIsland {
        static class Pair{
        int row;
        int col;
        Pair(int row,int col)
        {
            this.row = row;
            this.col = col;
        }
    }
    public static void bfs(int i,int j,char [][] grid,boolean [][]vis)
    {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        vis[i][j] = true;
        while(!q.isEmpty())
        {
            Pair pair = q.poll();
            if(pair.row-1>=0 && pair.row-1<grid.length && pair.col>=0 && pair.col<grid[0].length && grid[pair.row-1][pair.col]=='1' && !vis[pair.row-1][pair.col])
            {
                vis[pair.row-1][pair.col] = true;
                q.add(new Pair(pair.row-1,pair.col));
            }
            if(pair.row+1>=0 && pair.row+1<grid.length && pair.col>=0 && pair.col<grid[0].length && grid[pair.row+1][pair.col]=='1' && !vis[pair.row+1][pair.col])
            {
                vis[pair.row+1][pair.col] = true;
                q.add(new Pair(pair.row+1,pair.col));
            }
            if(pair.row>=0 && pair.row<grid.length && pair.col-1>=0 && pair.col-1<grid[0].length && grid[pair.row][pair.col-1]=='1' && !vis[pair.row][pair.col-1])
            {
                vis[pair.row][pair.col-1] = true;
                q.add(new Pair(pair.row,pair.col-1));
            }
            if(pair.row>=0 && pair.row<grid.length && pair.col+1>=0 && pair.col+1<grid[0].length && grid[pair.row][pair.col+1]=='1' && !vis[pair.row][pair.col+1])
            {
                vis[pair.row][pair.col+1] = true;
                q.add(new Pair(pair.row,pair.col+1));
            }
        }
    }
    public static void main(String[] args) {
        // Problem Name - Number of Islands
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        int count = 0;
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[i].length; j++)
            {
                if(!vis[i][j] && grid[i][j]=='1')
                {
                    count++;
                    bfs(i,j,grid,vis);
                }
            }
        }
        System.out.println("Number of Islands: " + count);
    }
}
