import java.util.Stack;

public class infixToPostfix {
    public static int prec(char c) {
        if (c == '^')  // Exponent operator has highest precedence
            return 3;
        else if (c == '/' || c == '*')  // Multiplication and division have higher precedence than addition
            return 2;
        else if (c == '+' || c == '-')  // Addition and subtraction have lowest precedence
            return 1;
        else
            return -1;
    }
    public static void main(String[] args)
    {
        //Problem Name - Infix to postfix conversion
        //Example - Input:
        // a + b * (c^d - e) ^ (f + g * h) - i  
        // Output:
        // abcd^e-fgh*+^*+i-  

        String s = "a + b * (c^d - e) ^ (f + g * h) - i ";
        Stack<Character> st = new Stack<>();
        String result = "";
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                result = result+c;
            }
            else if(c=='(')
            {
                st.push('(');
            }
            else if(c==')')
            {
                while(st.peek()!='(' && !st.isEmpty())
                {
                    result = result+st.pop();
                }
            }
            // If an operator is scanned
            else {
                while (!st.isEmpty() && prec(c) <= prec(st.peek())) {
                    result = result + st.pop();
                }
                st.push(c);  // Push the current operator to the stack
            }
        }

        // Pop all the remaining elements from the stack
        while (!st.isEmpty()) {
            result = result + st.pop();
        }

        System.out.println("Postfix expression: " + result);  // Output the result
    }
}
