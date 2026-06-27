import java.util.ArrayList;
import java.util.List;

public class combinations_02 {
    public static void combination(int n,int i,List<Integer> ans,List<List<Integer>> result,int k)
    {
        if(i>n)
        {
            if(k==ans.size())
            {
                result.add(new ArrayList<>(ans));
            }
            return;
        }
        ans.add(i);
        combination(n,i+1,ans,result,k);
        ans.remove(ans.size()-1);
        combination(n,i+1,ans,result,k);
    }
    public static void main(String[] args)
    {
        int n = 4;
        int k = 2;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        combination(n,1,ans,result,k);
        System.out.println(result);
    }
}
