import java.util.ArrayList;

public class printLIS {
    public static void main(String[] args)
    {
        int nums[] = {1,3,5,4,7};
        int dp[] = new int[nums.length];
        int trace[] = new int[nums.length];
        for (int i = 0; i <nums.length; i++) {
            trace[i] = -1;
            dp[i] = 1;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int idx = 0;
        int maxi = 1;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<i; j++)
            {
                if(nums[i]>nums[j] && dp[j]+1>dp[i])
                {
                    dp[i] = Math.max(dp[i],1+dp[j]);
                    trace[i] = j;
                }
            }
            if(dp[i]>maxi)
            {
                maxi = dp[i];
                idx = i;
            }
        }
        while(idx>-1)
        {
            ans.add(nums[idx]);
            idx = trace[idx];
        }
        System.out.println(ans);
    }
}
