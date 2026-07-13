import java.util.Stack;

public class prefixToInfix {
    public static void main(String[] args) {
        //Problem Name - Prefix to Infix Conversion
        //Input:
        // expression = "+ab"
        // Output:
        // (a+b)
        String s = "+ab";
        Stack<String> st = new Stack<>();
        for(int i=s.length()-1; i>=0; i--)
        {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                st.push(String.valueOf(c));
            } else {
                // Pop two operands from the stack
                String op1 = st.pop();
                String op2 = st.pop();
                st.push("(" + op1 + c + op2 + ")");
            }
        }
        System.out.println(st.peek());
    }
}
