import java.util.HashMap;
import java.util.Scanner;

public class SingleNumber {
    //Problem Name -137. Single Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int nums[] = new int[n];
    for(int i=0; i<n; i++)
    {
        nums[i] = sc.nextInt();
    }
    HashMap<Integer,Integer> count=new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        int ans  = 0;
        for(int i: count.keySet())
        {
            if(count.get(i)==1)
            {
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
