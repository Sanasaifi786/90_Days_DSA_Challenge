import java.util.*;
public class LCSubstring {
    static int maxi = 0;
    public static int LCS(String s1,String s2,int n,int m, int dp[][])
    {
        if(n==0 || m==0)
        {
            return 0;
        }
        if(dp[n][m]!=-1)
        {
            return dp[n][m];
        }
        if(s1.charAt(n-1)==s2.charAt(m-1))
        {
            dp[n][m] = 1+LCS(s1,s2,n-1,m-1,dp);
            maxi = Math.max(maxi,dp[n][m]);
            return maxi;
        }
        else{
            return dp[n][m]=0;
        }
    }
    public static void main(String[] args)
    {
        //problem name = longest comman substring
        String s1 = "abcde";
        String s2 = "abfce";
        int dp[][] = new int[s1.length()+1][s2.length()+1];
        for(int i[]: dp)
        {
            Arrays.fill(i, 0);
        }
        // int ans = LCS(s1,s2,s1.length(),s2.length(),dp);
        int ans  = 0;
        for(int i=1; i<s1.length()+1; i++)
        {
            for(int j=1; j<s2.length()+1; j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j] = 1+dp[i-1][j-1];
                    ans = Math.max(ans,dp[i][j]);
                }
                else{
                    dp[i][j]=0;
                }
            }
        }

        //printing dp table
        for(int i=0; i<s1.length()+1; i++)
        {
            for(int j=0; j<s2.length()+1; j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(ans);
    }
}
