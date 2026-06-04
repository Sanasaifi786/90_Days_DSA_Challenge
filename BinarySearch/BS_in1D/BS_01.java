import java.util.*;
public class BS_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Problem name - Binary Search
        //Problem Link - https://leetcode.com/problems/binary-search/description/
        //Approch
        // 1. linear search/Brute force
        // int n = sc.nextInt();
        // int nums[] = new int[n];
        // for(int i=0; i<n; i++)
        // {
        //     nums[i] = sc.nextInt();
        // }
        // int target = sc.nextInt();
        // int ans = -1;
        // for(int i=0; i<n; i++)
        // {
        //     if(nums[i]==target)
        //     {
        //         ans = i;
        //         break;
        //     }
        // } 
        // System.out.println(ans);
        //complexity - time: o(n) & space: o(1)

        //2. Binary Search/optimize
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = -1;
        int left = 0;
        int right = n-1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(nums[mid]==target)
            {
                ans = mid;
                break;
            }
            else if(nums[mid]>target)
            {
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        System.out.println(ans);
        //complexity - Time: o(logn) & Space: o(1)
    }
}
