import java.util.ArrayList;
public class validateBST_01 {
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

    public static void inorder(Node root,ArrayList<Integer> list)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    public static void main(String[] args)
    {
        //Problem Name - Validate Binary Search Tree
        //Problem Statement - A valid BST is defined as follows:
        // The left subtree of a node contains only nodes with keys strictly less than the node's key.
        // The right subtree of a node contains only nodes with keys strictly greater than the node's key.
        // Both the left and right subtrees must also be binary search trees.

        //Approch - First find inorder of BST and then check if it is sorted or not 

        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(4);
        root.right.left = new Node(3);
        root.right.right = new Node(6);

        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);

        boolean flag = false;
        for(int i=1; i<list.size(); i++)
        {
            if(list.get(i-1)>list.get(i))
            {
                flag = true;
            }
        }
        if(flag)
        {
            System.out.println(false);
        }
        else{
            System.out.println(true);
        }
     }
}
