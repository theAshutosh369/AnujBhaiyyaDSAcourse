package ANUJ_BHAIYYA.Binary_search_tree;

public class searching_in_bst {

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

    static Boolean search( Node root , int key )
    {
        if( root==null ) return false;
        if( root.data== key ) return true;
        if( key < root.data ) return search( root.left , key );
        else return search( root.right , key);
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

        System.out.println( search(root , 60) );


    }
}
