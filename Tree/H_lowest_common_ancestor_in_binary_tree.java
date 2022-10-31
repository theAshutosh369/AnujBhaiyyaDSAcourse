package ANUJ_BHAIYYA.Tree;

public class H_lowest_common_ancestor_in_binary_tree
{

    static class Node
    {
        int data ;
        Node left,right;
        Node( int data )
        {
            this.data = data;
            this.left= this.right=null;
        }
    }
    static Node lca( Node root , int n1 , int n2 )
    {
        if( root==null ) return null;
        if( root.data== n1 || root.data== n2 ) return root ;

        Node l = lca( root.left , n1 , n2 );
        Node r = lca( root.right , n1 , n2 );

        if( l==null ) return r;
        if( r==null ) return l;

        return root;
    }

    public static void main(String[] args)
    {
        Node root = new Node(5);
        root.left= new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.right = new Node(1);
        root.left.left.right.left = new Node(7);
        root.left.left.right.right = new Node(6);

        Node ans = lca( root , 1 , 3);
        System.out.println( ans.data );


    }
}
