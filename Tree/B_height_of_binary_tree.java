package ANUJ_BHAIYYA.Tree;

import java.util.Scanner;

public class B_height_of_binary_tree
{

    static Scanner s = new Scanner(System.in);
    static class Node
    {
        int data;
        Node l,r;
        Node(int data)
        {
            this.data = data;
            l=r=null;
        }
    }
    static Node createTree()
    {
        System.out.print("enter data : ");
        int data = s.nextInt();

        if( data==-1 ) return null;
        else
        {
            Node root = new Node(data);

            System.out.println("enter left child of " + data);
            root.l = createTree();

            System.out.println("enter right child of " + data);
            root.r = createTree();

            return root;
        }
    }

    static int height_of_tree( Node root )
    {
        if( root==null) return 0;
        else return ( Math.max( height_of_tree(root.l) ,  height_of_tree(root.r) ) )+ 1 ;
    }
    static int size_of_tree( Node root )
    {
        if( root==null) return 0;
        else return ( size_of_tree(root.l) + size_of_tree(root.r) )+ 1 ;
    }
    static int maximum_of_tree( Node root )
    {
        if( root==null) return Integer.MIN_VALUE;
        else return  Math.max(root.data, Math.max(maximum_of_tree(root.l),maximum_of_tree(root.r) ) );
    }
    static int minimum_of_tree( Node root )
    {
        if( root==null) return Integer.MAX_VALUE;
        else return  Math.min(root.data, Math.min(minimum_of_tree(root.l),minimum_of_tree(root.r) ) );
    }
    public static void main(String[] args)
    {
        Node root = createTree();
        System.out.println( "height of tree is : "+ height_of_tree(root ));
        System.out.println( "size of tree is : "+ size_of_tree(root) );
        System.out.println( "Maximum node of tree is : "+ maximum_of_tree(root) );
        System.out.println( "minimum node of tree is : "+ minimum_of_tree(root) );
    }

}
