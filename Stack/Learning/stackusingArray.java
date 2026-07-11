import java.util.ArrayList;

public class stackusingArray {
    public static void push(ArrayList<Integer> stack, int data) {
        stack.add(data);
        System.out.println(data + " pushed to stack");
    }
    public static int pop(ArrayList<Integer> stack)
    {
        if(stack.size()==0)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.remove(stack.size()-1);
    }
    public static int peek(ArrayList<Integer> stack)
    {
        if(stack.size()==0)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.get(stack.size()-1);
    }
    public static boolean isEmpty(ArrayList<Integer> stack)
    {
        if(stack.size()==0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> stack = new ArrayList<>();
        push(stack, 1);
        push(stack, 2); 
        push(stack,3);
        System.out.println(pop(stack));
        System.out.println(pop(stack));
        System.out.println("Top Element: "+ peek(stack));
        System.out.println(isEmpty(stack));
    }
}
