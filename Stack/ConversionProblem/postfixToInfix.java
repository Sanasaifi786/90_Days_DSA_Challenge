import java.util.Stack;

public class postfixToInfix {
    public static void main(String[] args)
    {
        //Problem Name - PostFix to InFix Conversion
        //Input: "ab+c*"
        // Output: "(a+b)*c"
        // String s = "ab+";
        String s = "ab+c*";
        Stack<String> st = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                st.push(String.valueOf(c));
            }
            else{
                String b = st.pop();
                String a = st.pop();
                st.push("("+a+c+b+")");
            }
        }
        System.out.println("Postfix to Prefix Conversion: "+ st.peek());
    }
}
