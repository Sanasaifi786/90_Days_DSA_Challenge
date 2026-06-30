
public class palindrome_04 {
    static class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        next = null;
    } 
    }
    public static boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node curr  = mid;
        Node prev = null;
        Node next;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return false;
            }
            left = left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println(isPalindrome(head));
    }
}
