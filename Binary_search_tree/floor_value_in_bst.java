package ANUJ_BHAIYYA.Binary_search_tree;

public class floor_value_in_bst {

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

    static int floor =-1  , ceil =-1 ;
    static void floor_and_ceil( Node root , int key)
    {
        while ( root!=null )
        {
            if( root.data == key )
            {
                floor = root.data;
                ceil = root.data;
                return;
            }
            else if( key > root.data )
            {
                floor = root.data ;
                root = root.right ;
            }
            else {
                ceil = root.data ;
                root = root.left ;
            }
        }
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

        floor_and_ceil( root , 4 );

        System.out.println( " floor : "+ floor + " ceil : "+ ceil );
    }
}
