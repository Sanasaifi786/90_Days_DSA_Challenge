import java.util.LinkedList;
import java.util.Queue;

public class maxAreaOfIsland {
        static class Pair{
        int row;
        int col;
        Pair(int row,int col)
        {
            this.row = row;
            this.col = col;
        }
    }
    public static int bfs(int[][] grid,int i,int j,boolean vis[][],int maxi)
    {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        vis[i][j] = true;
        int count = 0;
        while(!q.isEmpty())
        {
            Pair pair = q.poll();
            count++;
            if(pair.row-1>=0 && pair.row-1<grid.length && pair.col>=0 && pair.col<grid[0].length && grid[pair.row-1][pair.col]==1 && !vis[pair.row-1][pair.col])
            {
                vis[pair.row-1][pair.col] = true;
                q.add(new Pair(pair.row-1,pair.col));
            }
            if(pair.row+1>=0 && pair.row+1<grid.length && pair.col>=0 && pair.col<grid[0].length && grid[pair.row+1][pair.col]==1 && !vis[pair.row+1][pair.col])
            {
                vis[pair.row+1][pair.col] = true;
                q.add(new Pair(pair.row+1,pair.col));
            }
            if(pair.row>=0 && pair.row<grid.length && pair.col-1>=0 && pair.col-1<grid[0].length && grid[pair.row][pair.col-1]==1 && !vis[pair.row][pair.col-1])
            {
                vis[pair.row][pair.col-1] = true;
                q.add(new Pair(pair.row,pair.col-1));
            }
            if(pair.row>=0 && pair.row<grid.length && pair.col+1>=0 && pair.col+1<grid[0].length && grid[pair.row][pair.col+1]==1 && !vis[pair.row][pair.col+1])
            {
                vis[pair.row][pair.col+1] = true;
                q.add(new Pair(pair.row,pair.col+1));
            }
        }
        return maxi = Math.max(count,maxi);
    }
    public static void main(String[] args)
    {
        int [][]grid = {
            {0,0,1,0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,1,1,0,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,1,1,0,0,1,0,1,0,0},
            {0,1,0,0,1,1,0,0,1,1,1,0,0},
            {0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        int n = grid.length; 
        boolean vis[][] = new boolean[n][grid[0].length];
        int maxi = 0;
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length; j++)
            {
                if(!vis[i][j] && grid[i][j]==1)
                {
                    maxi = bfs(grid,i,j,vis,maxi);
                }
            }
        }
        System.out.println("Max Area of Island: "+ maxi);
    }
}
