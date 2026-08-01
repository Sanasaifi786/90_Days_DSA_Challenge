import java.util.Arrays;

public class stoneGame {
    public static int game(int []nums,int i, int j,int [][] mat)
    {
        if(i==j)
        {
            return mat[i][j] = nums[i];
        }
        if(mat[i][j]!=0)
        {
            return mat[i][j];
        }
        int val1 = nums[i] - game(nums,i+1,j,mat);
        int val2 = nums[j] - game(nums,i,j-1,mat);
        return mat[i][j]= Math.max(val1,val2);
    }
    public static boolean stoneGame(int[] piles) {
        int mat[][] = new int[piles.length][piles.length];
        for(int[] i: mat)
        {
            Arrays.fill(i,0);
        }
        int ans = game(piles,0,piles.length-1,mat);
        if(ans>0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] piles = {5, 3, 4, 5};
        System.out.println(stoneGame(piles));
    }
}
