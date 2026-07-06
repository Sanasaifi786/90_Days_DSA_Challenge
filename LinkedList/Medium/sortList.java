public class sortList {
    static class Node{
        int val;
        Node next;
        Node(int data1, Node next1) {
        val = data1;
        next = next1;
    }
        Node(int data1) {
            val = data1;
            next = null;
        }
    }
    //Brute force - using two loops
    public static Node sortList(Node head) {
        Node temp1  = head;
        while(temp1!=null)
        {
            Node temp2 = temp1.next;
            while(temp2!=null)
            {
                if(temp1.val>temp2.val)
                {
                    int temp = temp1.val;
                    temp1.val = temp2.val;
                    temp2.val = temp;
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(3);

        Node newHead = sortList(head);
        Node temp = newHead;
        while(temp!=null)
        {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
