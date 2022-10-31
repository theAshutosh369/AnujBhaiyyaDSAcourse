package ANUJ_BHAIYYA.Tree;


import java.util.*;

public class E_top_n_bottom_view_of_tree {

    static class Node {
        int data ;
        Node left,right;
        Node( int data )
        {
            this.data = data;
            this.left= this.right=null;
        }
    }

    static class pair{
        Node node;
        int hd ;
        pair( Node node , int hd  ){
            this.node = node;
            this.hd = hd;
        }
    }

    static void topView( Node root )
    {
        Queue<pair> q = new ArrayDeque<>();
        Map<Integer , Node > m = new TreeMap<>();

        q.add( new pair(root , 0));
        while (!q.isEmpty())
        {
            pair cur = q.poll();

            if( !m.containsKey( cur.hd ))
            {
                m.put( cur.hd , cur.node );
            }

            if( cur.node.left != null)
            {
                q.add( new pair( cur.node.left ,  cur.hd -1 ));
            }
            if( cur.node.right != null)
            {
                q.add( new pair( cur.node.right ,  cur.hd +1 ));
            }
        }

        for (Map.Entry<Integer , Node > e : m.entrySet() )
        {
            System.out.print( e.getValue().data  +" ");
        }
    }

    static void bottomView( Node root )
    {
        Queue<pair> q = new ArrayDeque<>();
        Map<Integer , Node > m = new TreeMap<>();

        q.add( new pair(root , 0));
        while (!q.isEmpty())
        {
            pair cur = q.poll();

            m.put( cur.hd , cur.node );


            if( cur.node.left != null)
            {
                q.add( new pair( cur.node.left ,  cur.hd -1 ));
            }
            if( cur.node.right != null)
            {
                q.add( new pair( cur.node.right ,  cur.hd +1 ));
            }
        }

        for (Map.Entry<Integer , Node > e : m.entrySet() )
        {
            System.out.print( e.getValue().data  +" ");
        }
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

        topView( root );
        System.out.println();
        bottomView( root );

    }
}

// tc( topview ) : O(n)
// tc( bottomview ) : O(n)


