public class BTConstruction {
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
    static int idx = -1;
    public static Node construct(int pre[])
    {
        idx++;
        if(pre[idx]==-1)
        {
            return null;
        }
        Node newNode = new Node(pre[idx]);
        newNode.left = construct(pre);
        newNode.right = construct(pre);
        return newNode;
    }
    public static void main(String[] args) {
        //Problem name = Construction of Binary tree

        int pre[]  = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = construct(pre);
        System.out.println("Binary tree constructed successfully.");
    }
}
