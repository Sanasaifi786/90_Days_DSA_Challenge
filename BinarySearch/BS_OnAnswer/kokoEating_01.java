import java.util.*;
public class kokoEating_01 {
    public static int eatingPerHour(int nums[],int mid)
    {
        int total = 0;
        for(int i=0; i<nums.length; i++)
        {
            total += Math.ceil(nums[i]/mid);
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {3,6,7,11};
        int h = 8;
        int low = 1;
        int high = 0;
        for(int i=0; i<nums.length; i++)
        {
            high = Math.max(nums[i],high);
        }
        int ans = 0;
        while(low<=high)
        {
            int mid = (low+high)/2;
            System.out.println(mid);
            int val = eatingPerHour(nums,mid);
            if(val<=h)
            {
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(ans);
    }
}
