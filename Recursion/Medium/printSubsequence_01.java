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
    public static void main(String[] args) {
        int nums[] = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        subset(nums,0,list);
    }
}
