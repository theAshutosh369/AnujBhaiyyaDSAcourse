package ANUJ_BHAIYYA.Tree;


public class G_diameter_of_binary_tree {

    static class Node {
        int data ;
        Node left,right;
        Node( int data )
        {
            this.data = data;
            this.left= this.right=null;
        }
    }
    static int ans =0;
    static int height( Node root)
    {
        if( root == null ) return 0;
        int lh = height( root.left );
        int rh = height( root.right );
        ans = Math.max( ans , (1+lh +rh));
        return 1+ Math.max( lh , rh );
    }

    public static void main(String[] args) {

//        Node root = new Node(3);
//        root.left = new Node(2);
//        root.right = new Node(4);
//        root.right.left = new Node(1);
//        root.right.right = new Node(5);

        Node root = new Node(4);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(6);
        root.right.left = new Node(2);
        root.right.left.right = new Node(1);


        height( root );
        System.out.println(ans );
    }
}
