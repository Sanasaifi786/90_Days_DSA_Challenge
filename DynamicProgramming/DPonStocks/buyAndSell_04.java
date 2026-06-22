import java.util.Arrays;
import java.util.Scanner;

public class buyAndSell_04 {
    public static int  buyAndSell(int prices[],int i,int buy,int cap,int [][][]dp)
    {
        if(cap==0)
        {
            return 0;
        }
        if(i==prices.length)
        {
            return 0;
        }
        if(dp[i][buy][cap]!=-1)
        {
            return dp[i][buy][cap];
        }
        if(buy==1)
        {
            int canBuy = -prices[i] + buyAndSell(prices,i+1,0,cap,dp);
            int notBuy = buyAndSell(prices,i+1,1,cap,dp);
            dp[i][buy][cap] = Math.max(canBuy,notBuy);
            return dp[i][buy][cap];
        }
        else{
            int sell = prices[i]+buyAndSell(prices,i+1,1,cap-1,dp);
            int notSell = buyAndSell(prices,i+1,0,cap,dp);
            dp[i][buy][cap] = Math.max(sell,notSell);
            return dp[i][buy][cap];
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for(int i=0; i<n; i++)
        {
            prices[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int dp[][][] = new int[prices.length][2][3];
        for(int i=0; i<dp.length; i++)
        {
            for(int j=0; j<2; j++)
            {
                Arrays.fill(dp[i][j],-1);
            }
        }
        System.out.println( buyAndSell(prices,0,1,k,dp) );
    }
}
