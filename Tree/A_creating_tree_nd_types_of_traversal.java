package ANUJ_BHAIYYA.Tree;

import java.util.Scanner;

public class A_creating_tree_nd_types_of_traversal {
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

            System.out.println("enter left of " + data);
            root.l = createTree();

            System.out.println("enter right of " + data);
            root.r = createTree();

            return root;
        }
    }
    static void inOrder( Node root )
    {
        if( root==null ) return;

        inOrder( root.l );
        System.out.print(root.data+" ");
        inOrder( root.r );

    }
    static void preOrder( Node root )
    {
        if( root==null ) return;

        System.out.print(root.data+" ");
        preOrder( root.l );
        preOrder( root.r );

    }
    static void postOrder( Node root )
    {
        if( root==null ) return;

        postOrder( root.l );
        postOrder( root.r );
        System.out.print(root.data+" ");

    }
    public static void main(String[] args)
    {
        Node root = createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
    }
}

