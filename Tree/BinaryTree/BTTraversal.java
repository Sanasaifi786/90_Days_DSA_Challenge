public class BTTraversal {
    class Node{
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
    public static void preorder(Node root){
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        //Problem name = Traversal of Binary tree
        Node root = new BTTraversal().new Node(1);
        root.left = new BTTraversal().new Node(2);
        root.right = new BTTraversal().new Node(3);
        root.left.left = new BTTraversal().new Node(4);
        root.left.right = new BTTraversal().new Node(5);
        root.right.left = new BTTraversal().new Node(6);
        root.right.right = new BTTraversal().new Node(7);

        System.out.println("Preorder Traversal:");
        preorder(root);
        System.out.println();
        System.out.println("Inorder Traversal:");
        inorder(root);
        System.out.println();
        System.out.println("Postorder Traversal:");
        postorder(root);
        System.out.println();
    }
}
