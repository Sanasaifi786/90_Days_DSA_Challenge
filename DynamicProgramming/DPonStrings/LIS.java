import java.util.*;

public class LIS {
    public static int LIS(int nums[], List<Integer> list,int n,int m,int dp[][])
    {
        if(n==0 || m==0)
        {
            return 0;
        }
        if(dp[n][m]!=0)
        {
            return dp[n][m];
        }
        if(nums[n-1]==list.get(m-1))
        {
            dp[n][m] = 1+LIS(nums,list,n-1,m-1,dp);
            return dp[n][m];
        }
        else{
            int left = LIS(nums,list,n-1,m,dp);
            int right = LIS(nums,list,n,m-1,dp);
            dp[n][m] = Math.max(left,right);
            return dp[n][m];
        }
    }
    public static void main(String[] args)
    {
        //problem name = Longest increasing subsequence
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<nums.length; i++)
        {
            nums[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
                list.add(nums[i]);
            }
        }
        Collections.sort(list);
        // System.out.println(list);
        int dp[][] = new int[nums.length+1][list.size()+1];
        System.out.println(LIS(nums,list,nums.length,list.size(),dp));
    }
}
