package ANUJ_BHAIYYA.Binary_search_tree;


public class inserting_into_bst {
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

    static Node insert_rec( Node root , int key )
    {
        if( root==null )
        {
            return new Node(key);
        }
        if( key< root.data )
        {
            root.left = insert_rec( root.left , key);
        }
        else if( key> root.data ) {
            root.right = insert_rec( root.right , key );
        }
        return root;
    }

    static Node insert_Iterative( Node root , int key ) {
        Node nn = new Node(key);
        Node parent = null;
        Node cur = root;

        while (cur != null)
        {
            parent=cur;
            if( key< cur.data )
            {
                cur = cur.left;
            }
            else {
                cur=cur.right;
            }
        }

        if( parent== null )
        {
            return nn;
        }
        else if( key< parent.data )
        {
            parent.left = nn;
        }
        else {
            parent.right = nn;
        }

        return root;
    }
    static void print( Node root )
    {
        if( root==null ) return;

        print( root.left);
        System.out.print( root.data+" ");
        print(root.right);
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



//        insert_rec(root ,30);
//        insert_rec(root , 40);
//        insert_rec(root , 50);
//        insert_rec(root , 11);
//        print(root);

        System.out.println();
        insert_Iterative( root , 50);
        insert_Iterative( root , 40);
        insert_Iterative( root , 200);
        insert_Iterative( root , 0);
        print(root);

    }
}
