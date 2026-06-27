import java.util.ArrayList;

public class printSubsequence_01 {
    public static void subset(int[] nums,int i,ArrayList<Integer> list)
    {
        if(i>=nums.length)
        {
            System.out.println(list);
            return;
        }
        list.add(nums[i]);
        subset(nums,i+1,list);
        list.remove(list.size()-1);
        subset(nums,i+1,list);
    }
    public static boolean subset_01(int[] nums,int i,ArrayList<Integer> list,int sum)
    {
        if(i>=nums.length)
        {
            if(sum==0)
            {
                System.out.println(list);
                return true;
            }
            return false;
        }
        list.add(nums[i]);
        if(subset_01(nums, i+1, list, sum-nums[i])==true)
        {
            return true;   
        }
        list.remove(list.size()-1);
        sum -= nums[i];
        if(subset_01(nums,i+1,list,sum)==true)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        subset(nums,0,list);

        //print only one subsequence
        subset_01(nums,0,list,2);
    }
}
