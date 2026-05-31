import java.util.*;
public class TwoSum_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Problem name - Two Sum
        // example -  Input: nums = [2,7,11,15], target = 9
        // Output: [0,1]
        //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        //Brute force 
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result[] = new int[2];
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        for(int i=0; i<result.length; i++)
        {
            System.out.println(result[i]);
        }

        //complexity - Time: o(n^2) & space: o(1)
    }
}
