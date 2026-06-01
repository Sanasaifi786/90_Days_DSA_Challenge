import java.util.*;
public class RotateArray_03 {
    public static void main(String[]args){
        //Problem name - Rotate Array   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int result[] = new int[n];
        for(int i=n-1; i>=0; i--)
        {
            int val = (i+k)%n;
            result[val] = nums[i];
        }
        for(int i=0; i<result.length; i++)
        {
            System.out.println(result[i]);
        }
        //complexity - Time: o(n) & space: o(n)
    }
}
