package ANUJ_BHAIYYA.Tree;

public class F_Convert_binary_tree_to_doubly_LL {
    static class Node {
        int data ;
        Node left,right;
        Node( int data )
        {
            this.data = data;
            this.left= this.right=null;
        }
    }

    static Node head =null , prev = null;
    static void flattenTree( Node root )
    {
        if( root==null ) return;

        flattenTree( root.left );

        if( prev==null ) head=prev=root;
        else {
            prev.right = root;
            root.left = prev;
            prev = root ;
        }
        System.out.print(root.data+" ");

        flattenTree( root.right );
    }

    public static void main(String[] args)
    {
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(2);
        root.right.left = new Node(1);
        root.right.left.left = new Node(4);
        root.right.left.right = new Node(6);

        flattenTree( root );
    }
}
