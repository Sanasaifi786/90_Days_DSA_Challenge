public class wordSearch_01 {
    public static boolean solve(char[][] board,int i,int j,int idx, String s,boolean[][] vis)
    {
        if(idx==s.length())
        {
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=s.charAt(idx))
        {
            return false;
        }
        //down
        boolean down = false;
        if(s.charAt(idx)==board[i][j] && !vis[i][j])
        {
            vis[i][j] = true;
            down = solve(board,i+1,j,idx+1,s,vis);
            vis[i][j] = false;
        }
        //up
        boolean up = false;
        if(s.charAt(idx)==board[i][j] && !vis[i][j])
        {
            vis[i][j] = true;
            up = solve(board,i-1,j,idx+1,s,vis);
            vis[i][j] = false;
        }
        //right
        boolean right = false;
        if(s.charAt(idx)==board[i][j] && !vis[i][j])
        {
            vis[i][j] = true;
            right = solve(board,i,j+1,idx+1,s,vis);
            vis[i][j] = false;
        }
        //left
        boolean left = false;
        if(s.charAt(idx)==board[i][j] && !vis[i][j])
        {
            vis[i][j] = true;
            left = solve(board,i,j-1,idx+1,s,vis);
            vis[i][j] = false;
        }
        return down || up || left || right;
    }
    public static boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean vis[][] = new boolean[row][col];
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[i].length; j++)
            {
                if(solve(board,i,j,0,word,vis))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        // problem name - Word Search  

        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        System.out.println(exist(board,"ABCCED"));
        System.out.println(exist(board,"SEE"));
        System.out.println(exist(board,"ABDCE"));
    }
}
