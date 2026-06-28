
public class searchBST_02 {
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
    public static Node searchInBST(Node root, int val) {
        if(root==null)
        {
            return root;
        }
        if(root.data==val)
        {
            return root;
        }
        else if(root.data>val)
        {
           return searchInBST(root.left, val);
        }
        else{
            return searchInBST(root.right,val);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(4);
        root.right.left = new Node(3);
        root.right.right = new Node(6);

        int target = 4;
        System.out.println(searchInBST(root,target));
    }
}
