package ANUJ_BHAIYYA.Binary_search_tree;



public class Deleting_in_BST {

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

    static void traverse( Node root )
    {
        if( root==null ) return;

        traverse( root.left );
        System.out.print( root.data +" ");
        traverse( root.right );

    }

    static Node delete( Node root , int key )
    {
        if( root== null ) return root;

        if( key< root.data)
        {
            root.left = delete( root.left , key );
        }
        else if ( key > root.data )
        {
            root.right = delete( root.right , key );
        }
        else {
            if( root.left == null ) return root.right;
            else if( root.right == null ) return root.left ;

            root.data = minvalue( root.right );
            root.right = delete( root.right , root.data );
        }

        return root;
    }
    static int minvalue( Node root )
    {
        int min = root.data ;
        if( root.left!=null )
        {
            root= root.left;
            min = root.data;
        }
        return min;
    }
    public static void main(String[] args)
    {
        Node root = new Node(20);
        root.left= new Node(10);
        root.right = new Node(25);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.left = new Node(22);
        root.right.right = new Node(30);

        traverse( root );
        System.out.println();
        delete(root , 15);
        traverse(root);


    }
}
