public class LPS {
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
    public static void main(String[] args) {
        //problem name = Longest Palindrome Subsequence
        String s1 = "agbcba";
        String s2 = "";
        for(int i=0; i<s1.length(); i++)
        {
            s2 = s1.charAt(i)+s2;
        }
        int val = lcs(s1,s2,s1.length(),s2.length());
        System.out.println(val);
    }
}
