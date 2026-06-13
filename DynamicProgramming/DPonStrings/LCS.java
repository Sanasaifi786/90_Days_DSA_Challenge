public class LCS {
    //Recursive Approch
    public static int lcs(String s1,String s2, int n , int m)
    {
        if(n==0 || m==0)
        {
            return 0;
        }
        if(s1.charAt(n-1)==s2.charAt(m-1))
        {
            return 1+lcs(s1,s2,n-1,m-1);
        }
        else{
            int left = lcs(s1,s2,n-1,m);
            int right = lcs(s1,s2,n,m-1);
            return Math.max(left,right);
        }
    }
    public static void main(String[] args)
    {
        //problem name - Longest comman Subquence
        String s1 = "abcdgh";
        String s2 = "abedfh";

        System.out.println(lcs(s1,s2,s1.length(),s2.length()));
    }
}
