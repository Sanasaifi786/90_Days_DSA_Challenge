import java.util.*;
public class largestElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            if(nums[i]>maxi)
            {
                maxi = nums[i];
            }
        }
        System.out.println(maxi);
    }
}
