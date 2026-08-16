import java.util.Scanner;

public class findSqrt {
    public static void main(String[] args)
    {
        //Problem Name - find square root of number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int low = 1;
        int high = n;

        int ans =0;
        while(low<=high)
        {
            int mid = (high+low)/2;
            if(mid*mid<=n)
            {
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(ans);
    }
}
