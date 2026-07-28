import java.util.LinkedList;
import java.util.Queue;

public class islandPerimeter {
    static class Pair{
        int row;
        int col;
        public Pair(int row,int col)
        {
           this.row = row;
           this.col = col;
    }
    }
    public static int bfs(int grid[][], int i,int j, boolean vis[][], int dr[], int dc[])
    {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        vis[i][j] = true;
        int perimeter = 4;
        while(!q.isEmpty())
            {
                Pair pair = q.remove();
                for(int k=0; k<4; k++)
                {
                        int newRow = pair.row+ dr[k];
                        int newCol = pair.col+ dc[k];                       
                        if(newRow>=0 && newRow<grid.length && newCol>=0 && newCol<grid[0].length && grid[newRow][newCol]==1)
                        {
                            if(!vis[newRow][newCol]){
                                perimeter--;
                                vis[newRow][newCol] = true;
                                q.add(new Pair(newRow, newCol));
                                perimeter = perimeter + 4;                            }
                            else{
                                perimeter--;
                            }
                        }
                }
            }
        return perimeter;
    }
    public static int islandPerimeter(int[][] grid) {
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        int peri = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++)
                {
                    if(!vis[i][j] && grid[i][j]==1)
                    {
                        peri =  bfs(grid,i,j,vis,dr,dc);
                    }
                }
        }
        return peri;
    }
    public static void main(String[] args) {
        //Problem Name: 463. Island Perimeter
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(grid));
    }
}
