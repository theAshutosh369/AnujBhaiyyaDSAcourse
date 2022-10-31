package ANUJ_BHAIYYA.Tree;

import java.util.Scanner;

public class D_left_N_right_view_of_a_tree
{
    static Scanner s = new Scanner(System.in);

    static class Node
    {
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            left=right=null;
        }
    }

    static int max_level=0;
    static void left_view( Node root , int level )
    {
        if( root==null ) return;
        if( max_level<level )
        {
            System.out.print(root.data+" ");
            max_level=level;
        }

        left_view( root.left , level+1 );
        left_view( root.right , level+1 );
    }
    static void right_view( Node root , int level )
    {
        if( root==null ) return;
        if( max_level<level )
        {
            System.out.print(root.data+" ");
            max_level=level;
        }

        right_view( root.right , level+1 );
        right_view( root.left , level+1 );

    }

    public static void main(String[] args)
    {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.left.right.right = new Node(13);
        root.right.right.left = new Node(14);

//        left_view( root  ,  1);
        right_view( root  ,  1);
    }

}
