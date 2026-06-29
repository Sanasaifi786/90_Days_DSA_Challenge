public class delete_03 {
    static class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        next = null;
    }  
}
    public static Node deleteAtStart(Node head)
    {
        if(head==null)
        {
            return null;
        }
        head = head.next;
        return head;
    }
    public static void main(String[] args) {
        //problem name - deletion in linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // delete from the starting
        Node newHead = deleteAtStart(head);
        while(newHead!=null)
        {
            System.out.println(newHead.data);
            newHead = newHead.next;
        }
        
    }
}
