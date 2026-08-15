import java.util.Scanner;

public class lowerBound {
    public static int lowerBound(int nums[],int target)
    {
        int low = 0; 
        int high = nums.length-1;
        int ans = nums.length;
        while(low<=high)
        {
            int mid = (high-low)/2;
            if(nums[mid]>=target)
            {
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        //Problem Name - Lower Bound
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(lowerBound(nums,target));
    }
}
