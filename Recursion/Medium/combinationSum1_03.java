import java.util.ArrayList;
import java.util.List;

public class combinationSum1_03 {
    public static void comSum(int[] candi, int i,List<Integer> ans, List<List<Integer>> result,int sum)
    {
        if(i==candi.length)
        {
            if(sum==0)
        {
            result.add(new ArrayList<>(ans));
            return;
        }
        return;
        }
        if(candi[i]<=sum)
        {
            ans.add(candi[i]);
            comSum(candi,i,ans,result,sum-candi[i]);
            ans.remove(ans.size()-1);
        }
        comSum(candi,i+1,ans,result,sum);
    }
    public static void main(String[] args)
    {
        int nums[] = {2,3,6,7};
        int sum = 7;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        comSum(nums,1,ans,result,sum);
        System.out.println(result);
    }
}
