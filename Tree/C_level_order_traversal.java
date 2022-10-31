package ANUJ_BHAIYYA.Tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class C_level_order_traversal {

    static Scanner s = new Scanner(System.in);

    static class Node
    {
        int data;
        Node l,r;
        Node(int data){
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
    static void level_order( Node root )
    {
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while ( !q.isEmpty())
        {
            Node n = q.poll();
            System.out.print( n.data+" " );
            if( n.l !=null )
            {
                q.add(n.l);
            }
            if( n.r !=null )
            {
                q.add(n.r);
            }
        }
    }

    public static void main(String[] args) {
        Node root = createTree();
        level_order(root);
    }
}
