
public class reverse_01 {
    static class Node{
        int data;
        Node next;
        Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }
        Node(int data1) {
            data = data1;
            next = null;
        }
    }
    public static Node reverse(Node head)
    {
        Node prev = null;
        Node curr = head;
        Node newNode;
        while(head.next!=null)
        {
            newNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newNode;
        }
        return prev;
    }
    public static void main(String[] args) {
        //Problem Name - Revaerse the linked list

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node temp = reverse(head);
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
