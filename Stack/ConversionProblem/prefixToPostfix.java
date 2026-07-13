import java.util.Stack;

public class prefixToPostfix {
    public static void main(String[] args) {
        //Problem Name - Prefix to Postfix conversion
        // Input: "+ab"
        // Output: ab+
        // String s = "+ab";
        String s = "*+ab-cd";
        Stack<String> st = new Stack<>();
        for(int i=s.length()-1; i>=0; i--)
        {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                st.push(String.valueOf(c));
            }
            else{
                String a = st.pop();
                String b = st.pop();
                st.push(a+b+c);
            }
        }
        System.out.println(st.peek());
    }
}
