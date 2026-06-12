public class MaxDepth {
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
    public static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
    public static void main(String[] args) {
        Node root = new MaxDepth().new Node(1);
        root.left = new MaxDepth().new Node(2);
        root.right = new MaxDepth().new Node(3);
        root.left.left = new MaxDepth().new Node(4);
        root.left.right = new MaxDepth().new Node(5);
        System.out.println(maxDepth(root));
    }
}
