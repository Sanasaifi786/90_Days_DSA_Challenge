import java.util.Arrays;
import java.util.Scanner;

public class buyAndSellCoolDown {
    public static  int  buyAndSell(int prices[],int i,int buy,int [][]dp)
    {
        if(i>=prices.length)
        {
            return 0;
        }
        if(dp[i][buy]!=-1)
        {
            return dp[i][buy];
        }
        if(buy==1)
        {
            int canBuy = -prices[i] + buyAndSell(prices,i+1,0,dp);
            int notBuy = buyAndSell(prices,i+2,1,dp);
            dp[i][buy] = Math.max(canBuy,notBuy);
            return dp[i][buy];
        }
        else{
            int sell = prices[i]+buyAndSell(prices,i+1,1,dp);
            int notSell = buyAndSell(prices,i+1,0,dp);
            dp[i][buy] = Math.max(sell,notSell);
            return dp[i][buy];
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
        int dp[][] = new int[prices.length][2];
        for(int[] i: dp)
        {
            Arrays.fill(i,-1);
        }
        System.out.println(buyAndSell(prices,0,1,dp));
    }
}
