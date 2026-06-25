
import java.util.Scanner;
public class printName {
    public static void print(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println("Sana");
        print(n-1);
    }
    public static void main(String[] args)
    {
        // printing name n times
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }    
}
