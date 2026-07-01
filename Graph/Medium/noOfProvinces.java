import java.util.ArrayList;

public class noOfProvinces {
    public static void dfs(int i,ArrayList<ArrayList<Integer>> result,boolean[] vis)
    {
        vis[i] = true;
        for(Integer j: result.get(i))
        {
            if(!vis[j])
            {
                dfs(j,result,vis);
            }
        }
    }
    public static void main(String[] args) {
        int[][] isConnected = {
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        };
        int n = isConnected.length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            result.add(new ArrayList<>());
        }
        for(int i=0; i<isConnected.length; i++)
        {
            for(int j=0; j<isConnected[i].length; j++)
            {
                if(i != j && isConnected[i][j] == 1)
                {
                    result.get(i).add(j);
                }
            }
        }
        boolean vis[] = new boolean[n];
        int count = 0;
        for(int i=0; i<n; i++)
        {
            if(!vis[i])
            {
                count++;
                dfs(i,result,vis);
            }
        }
        System.out.println(count);
    }
}
