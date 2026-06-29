public class insert_02 {
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
    public static Node insertAtStart(Node head,int x);
    {
        Node temp = head;
        if(temp.next==null || temp==null)
        {
            return null;
        }
        Node newTemp = new Node(x,temp);


    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        insertAtStart(head,0);
    }
}
