import java.util.*;
public class BestTimeBaS_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for(int i=0; i<n; i++)
        {
            prices[i] = sc.nextInt();
        }
        
        //first Approch
        int maxi = 0;
        for(int i=0; i<prices.length; i++)
        {
            for(int j=i+1; j<prices.length; j++)
            {
                if(prices[j]>prices[i])
                {
                    int val = prices[j]-prices[i];
                    maxi = Math.max(maxi,val);
                }
            }
        }
        System.out.println(maxi);

        // Second Approch
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0; i<prices.length; i++)
        {
            if(buyprice<prices[i])
            {
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else
            {
                buyprice=prices[i];
            }
        }
        System.out.println(maxprofit);
    }
}
