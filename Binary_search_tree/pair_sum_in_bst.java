package ANUJ_BHAIYYA.Binary_search_tree;

import java.util.HashSet;
import java.util.Set;

public class pair_sum_in_bst {
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

    static Set<Integer> s = new HashSet<>();
    static void isSumPresent( Node root , int sum )
    {
        if( root == null ) return;
        else {
            isSumPresent(root.left, sum);
            if (!s.contains(sum - root.data)) {
                s.add(root.data);
            } else {
                System.out.println(root.data + " " + (sum - root.data));
            }
            isSumPresent(root.right, sum);
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


        isSumPresent( root , 20);
    }
}
