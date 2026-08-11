import java.util.Scanner;

public class maximumSubarray {
    public static int maxSubarray(int nums[])
    {
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        int maxi = dp[0];
        for(int i=1; i<nums.length; i++)
        {
            dp[i] = Math.max(nums[i], dp[i-1]+nums[i]);
            maxi = Math.max(maxi,dp[i]);
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println(maxSubarray(nums));
    }
}
