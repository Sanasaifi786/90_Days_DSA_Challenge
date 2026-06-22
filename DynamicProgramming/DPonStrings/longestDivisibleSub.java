import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class longestDivisibleSub {
    public static void main(String[] args) {
        // problem name - Longest Divisible Subset
        int nums[] = {1,4,5,8,10,16};
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int dp[] = new int[nums.length];
        int trace[] = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            trace[i] = -1;
            dp[i] = 1;
        }
        int maxi = 1;
        int idx =0;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<i; j++)
            {
                if(nums[i]>nums[j] && nums[i]%nums[j]==0 && dp[j]+1>dp[i])
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
        for(int i=0; i<nums.length; i++)
        {
            System.out.print(dp[i]+" ");
            System.out.println(trace[i]);
        }
        while(idx>-1)
        {
            ans.add(nums[idx]);
            idx = trace[idx];
        }
        System.out.println(ans);
    }
}
