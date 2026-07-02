import java.util.LinkedList;
import java.util.Queue;

public class floodFill {
        static class Pair{
        int row;
        int col;
        Pair(int row,int col)
        {
            this.row = row;
            this.col = col;
        }
    }
    public static void bfs(int i,int j,int [][] grid,boolean [][]vis,int initial,int color,int [][]result)
    {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        vis[i][j] = true;
        while(!q.isEmpty())
        {
            Pair pair = q.poll();
            if(pair.row-1>=0 && pair.row-1<grid.length && pair.col>=0 && pair.col<grid[0].length && grid[pair.row-1][pair.col]==initial && !vis[pair.row-1][pair.col])
            {
                result[pair.row-1][pair.col] = color;
                vis[pair.row-1][pair.col] = true;
                q.add(new Pair(pair.row-1,pair.col));
            }
            if(pair.row+1>=0 && pair.row+1<grid.length && pair.col>=0 && pair.col<grid[0].length && grid[pair.row+1][pair.col]==initial && !vis[pair.row+1][pair.col])
            {
                result[pair.row+1][pair.col] = color;
                vis[pair.row+1][pair.col] = true;
                q.add(new Pair(pair.row+1,pair.col));
            }
            if(pair.row>=0 && pair.row<grid.length && pair.col-1>=0 && pair.col-1<grid[0].length && grid[pair.row][pair.col-1]==initial && !vis[pair.row][pair.col-1])
            {
                result[pair.row][pair.col-1] = color;
                vis[pair.row][pair.col-1] = true;
                q.add(new Pair(pair.row,pair.col-1));
            }
            if(pair.row>=0 && pair.row<grid.length && pair.col+1>=0 && pair.col+1<grid[0].length && grid[pair.row][pair.col+1]==initial && !vis[pair.row][pair.col+1])
            {
                result[pair.row][pair.col+1] = color;
                vis[pair.row][pair.col+1] = true;
                q.add(new Pair(pair.row,pair.col+1));
            }
        }
    }
    public static void main(String[] args) {
        // Problem Name - Flood Fill
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr = 1;
        int sc = 1;
        int color = 2;
        int initialColor = image[sr][sc];
        boolean vis[][] = new boolean[image.length][image[0].length];
        int result[][] = new int[image.length][image[0].length];
        for(int i = 0; i<image.length; i++)
        {
            for(int j=0; j<image[0].length; j++)
            {
                result[i][j] = image[i][j];
            }
        }
        result[sr][sc] = color;
        bfs(sr,sc,image,vis,initialColor,color,result);
        System.out.println("Flood Fill Result:");
        for(int i = 0; i<result.length; i++)
        {
            for(int j=0; j<result[0].length; j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
