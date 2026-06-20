import java.util.*;
public class LISusingBS {
    public static int binarySearch(ArrayList<Integer> ans, int val)
    {
        int low = 0;
        int high = ans.size()-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(ans.get(mid)==val)
            {
                return mid;
            }
            else if(ans.get(mid)>val)
            {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args)
    {
        int nums[] = {2,6,8,3,4,5,1};
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);

        for(int i=1; i<nums.length; i++)
        {
            int prev = ans.get(ans.size()-1);
            if(prev<=nums[i])
            {
                ans.add(nums[i]);
            }
            else{
                int idx = binarySearch(ans,nums[i]);
                ans.set(idx,nums[i]);
            }
        }
        System.out.println(ans);
    }
}
