package ANUJ_BHAIYYA.Tree;

import java.util.*;

public class I_vertical_order_traversal_of_tree {

    static class Node{
        int data;
        Node left , right ;
        Node( int data)
        {
            this.data = data;
            this.left=this.right=null;
        }
    }
    static class pair
    {
        Node node;
        int hd;
        pair( Node node , int d )
        {
            this.node = node;
            this.hd = d;
        }
    }

    static void vertical_traversal( Node root)
    {
        Queue<pair> q = new ArrayDeque<>();
        Map< Integer , ArrayList<Integer> > m = new TreeMap<>();

        q.add( new pair( root , 0 ));

        while ( !q.isEmpty() )
        {
            pair cur = q.poll();

            if( !m.containsKey(cur.hd) )
            {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add( cur.node.data );
                m.put( cur.hd , temp );
            }
            else {
                m.get( cur.hd ).add( cur.node.data );
            }

            if( cur.node.left != null )
            {
                q.add( new pair( cur.node.left , cur.hd-1));
            }
            if( cur.node.right != null )
            {
                q.add( new pair( cur.node.right , cur.hd+1));
            }
        }

        for( Map.Entry< Integer , ArrayList<Integer> > e : m.entrySet() )
        {
            System.out.print( e.getValue() + " ");
        }
    }
    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.right = new Node(50);
        root.left.right.right = new Node(40);

        vertical_traversal(root );

    }
}
