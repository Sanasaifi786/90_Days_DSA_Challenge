
import java.util.Scanner;

public class ReverseString_02 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //Problem name - Reverse String

        //Approach 1 - using String concatenation
        // String str = "Hello World";
        // String result = "";
        // for(int i=str.length()-1; i>=0; i--)
        // {
        //     result += str.charAt(i);
        // }
        // System.out.println(result);
        // //complexity - Time: o(n) & space: o(n)

        //Approach 2 - without extra space
        //Example 1:
        // Input: s = ["h","e","l","l","o"]
        // Output: ["o","l","l","e","h"]

        char s[] = {'h','e','l','l','o'};
        int i =0;
        int j=s.length-1;
        while(i<j)
        {
            char temp = s[i];
            s[i]=s[j];
            s[j] = temp;
            i++;
            j--;
        }
        i=0;
        for(i=0; i<s.length; i++)
        {
            System.out.println(s[i]);
        }
    }
}
