import java.util.ArrayList;

public class rootToNode {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void rootToPath(Node root, int val,ArrayList<Integer> list)
    {
        if(root==null)
        {
            return;
        }
        list.add(root.data);
        if(root.data == val)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            if(root.data!= val)
            {
                list.remove(list.size()-1);
            }
        }
        rootToPath(root.left,val,list);
        rootToPath(root.right, val, list);
    }
    public static void main(String[] args) {
        // Problem Name - Root to Node Path
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

        int val = 7;
        ArrayList<Integer> list = new ArrayList<>();
        rootToPath(root,val,list);
        System.out.println(list);
    }
}
