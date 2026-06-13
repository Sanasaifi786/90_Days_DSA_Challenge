public class printLCS {
    public static int lcsDP(String s1,String s2, int n , int m,int dp[][])
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
            dp[n][m] =  1+lcsDP(s1,s2,n-1,m-1,dp);
            return dp[n][m];
        }
        else{
            int left = lcsDP(s1,s2,n-1,m,dp);
            int right = lcsDP(s1,s2,n,m-1,dp);
            dp[n][m] = Math.max(left,right);
            return dp[n][m];
        }
    }
    public static void main(String[] args)
    {
        //problem name - Print Longest comman Subquence
        String s1 = "abcdgh";
        String s2 = "abedfh";

        int dp[][] = new int[s1.length()+1][s2.length()+1];
        for(int i=0; i<dp.length; i++)
        {
            for(int j = 0; j<dp[i].length; j++)
            {
                dp[i][j] = -1;
            }

        }
        System.out.println(lcsDP(s1,s2,s1.length(),s2.length(),dp));

        int i = s1.length();
        int j = s2.length();
        String ans = "";
        while(i>0 && j>0)
        {
            if(s1.charAt(i-1)==s2.charAt(j-1))
            {
                ans = s1.charAt(i-1)+ans;
                i--;
                j--;
            }
            else{
                if(dp[i-1][j]>dp[i][j-1])
                {
                    i--;
                }
                else{
                    j--;
                }
            }
        }
        System.out.println(ans);
    }
}
