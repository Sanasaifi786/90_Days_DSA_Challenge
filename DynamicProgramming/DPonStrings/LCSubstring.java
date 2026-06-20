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
            Arrays.fill(i, -1);
        }
        int ans = LCS(s1,s2,s1.length(),s2.length(),dp);
        System.out.println(ans);
    }
}
