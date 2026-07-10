import java.util.LinkedList;
import java.util.Queue;

public class binaryMatrix {
        static class Pair{
        int row;
        int col;
        Pair(int row,int col)
        {
            this.row = row;
            this.col = col;
        }
    }
    public static int bfs(int [][]grid,int i,int j, int [][]dist)
    {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        dist[i][j] = 1;
        while(!q.isEmpty())
        {
            Pair pair = q.poll();
            if(pair.row+1<grid.length && pair.col+1<grid[0].length && grid[pair.row+1][pair.col+1]==0 && dist[pair.row][pair.col]+1<dist[pair.row+1][pair.col+1])
            {
                dist[pair.row+1][pair.col+1] = dist[pair.row][pair.col]+1;
                q.add(new Pair(pair.row+1,pair.col+1));
            }
            if(pair.row+1<grid.length && pair.col-1>=0 && pair.col-1<grid[0].length && grid[pair.row+1][pair.col-1]==0 && dist[pair.row][pair.col]+1<dist[pair.row+1][pair.col-1])
            {
                dist[pair.row+1][pair.col-1] = dist[pair.row][pair.col]+1;
                q.add(new Pair(pair.row+1,pair.col-1));
            }
            if(pair.row-1>=0 && pair.row-1<grid.length && pair.col+1<grid[0].length && grid[pair.row-1][pair.col+1]==0 && dist[pair.row][pair.col]+1<dist[pair.row-1][pair.col+1])
            {
                dist[pair.row-1][pair.col+1] = dist[pair.row][pair.col]+1;
                q.add(new Pair(pair.row-1,pair.col+1));
            }
            if(pair.row-1>=0 && pair.row-1<grid.length && pair.col-1>=0 && pair.col-1<grid[0].length && grid[pair.row-1][pair.col-1]==0 && dist[pair.row][pair.col]+1<dist[pair.row-1][pair.col-1])
            {
                dist[pair.row-1][pair.col-1] = dist[pair.row][pair.col]+1;
                q.add(new Pair(pair.row-1,pair.col-1));
            }
            if(pair.row-1>=0 && pair.row-1<grid.length && pair.col>=0 && pair.col<grid[0].length && grid[pair.row-1][pair.col]==0 && dist[pair.row][pair.col]+1<dist[pair.row-1][pair.col])
            {
                dist[pair.row-1][pair.col] = dist[pair.row][pair.col]+1;
                q.add(new Pair(pair.row-1,pair.col));
            }
            if(pair.row+1>=0 && pair.row+1<grid.length && pair.col>=0 && pair.col<grid[0].length && grid[pair.row+1][pair.col]==0 && dist[pair.row][pair.col]+1<dist[pair.row+1][pair.col])
            {
                dist[pair.row+1][pair.col] = dist[pair.row][pair.col]+1;
                q.add(new Pair(pair.row+1,pair.col));
            }
            if(pair.row>=0 && pair.row<grid.length && pair.col-1>=0 && pair.col-1<grid[0].length && grid[pair.row][pair.col-1]==0 && dist[pair.row][pair.col]+1<dist[pair.row][pair.col-1])
            {
                dist[pair.row][pair.col-1] = dist[pair.row][pair.col]+1;
                q.add(new Pair(pair.row,pair.col-1));
            }
            if(pair.row>=0 && pair.row<grid.length && pair.col+1>=0 && pair.col+1<grid[0].length && grid[pair.row][pair.col+1]==0 && dist[pair.row][pair.col]+1<dist[pair.row][pair.col+1])
            {
                dist[pair.row][pair.col+1] = dist[pair.row][pair.col]+1;
                q.add(new Pair(pair.row,pair.col+1));
            }
        }
        return dist[grid.length-1][grid[0].length-1];
    }
    public static void main(String[] args)
    {
        int grid[][] = {
            {0,1,1,0,0,0},
            {0,1,0,1,1,0},
            {0,1,1,0,1,0},
            {0,0,0,1,1,0},
            {1,1,1,1,1,0},
            {1,1,1,1,1,0}
        };
        int row = grid.length;
        int col = grid[0].length;
        int dist[][] = new int[row][col];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        int result = bfs(grid,0,0,dist);
        if(result == Integer.MAX_VALUE)
        {
            System.out.println("No Shorest Path: "+ -1);
            return;
        }
        System.out.println("Shorest Path: "+ result);
    }
}
