package ANUJ_BHAIYYA.QUEUE;

import java.util.ArrayDeque;
import java.util.Queue;

class node
{
    int data;
    node next;
    node child;
    node( int d )
    {
        this.data = d;
        next=null;
        child=null;
    }
    static void flattenLL_meth_1( node head)
    {
        Queue<node> q = new ArrayDeque<>();
        node n = head;
        while (n!=null)
        {
            if( n.child!=null)
            {
                q.offer(n.child);
            }
            if( n.next == null )
            {
                n.next = q.poll();
            }
            n = n.next;
        }
    }

    static void flattenLL_meth_2( node head)
    {
        node last =head;
        node cur = head;

        while (last.next!=null)
        {
            last=last.next;
        }
        while (cur!=last)
        {
            if( cur.child!=null)
            {
                last.next=cur.child;
                node temp = cur.child;
                while (temp.next!=null)
                {
                    temp=temp.next;
                }
                last=temp;
            }
             cur=cur.next;
        }
    }

    static void print( node head)
    {
        node n = head;
        while (n!=null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
}

public class flattening_multilevel_ll_into_singly_ll
{
    public static void main(String[] args)
    {
        node head = new node(1);
        node two = new node(2);
        node three = new node(3);
        node four = new node(4);
        node five = new node(5);
        node six = new node(6);
        node seven = new node(7);
        node eight = new node(8);
        node nine = new node(9);
        node ten = new node(10);
        node eleven = new node(11);
        node twelve = new node(12);
        node thirteen = new node(13);
        node forteen = new node(14);
        node fifteen = new node(15);
        node sixteen = new node(16);
        node seventeen = new node(17);

        head.next = two;
        two.next=three;
        three.next=four;
        four.next=five;

        six.next=seven;
        seven.next=eight;

        nine.next=ten;
        thirteen.next=forteen;
        sixteen.next=seventeen;

        head.child=six;
        four.child=nine;
        seven.child = eleven;
        eight.child=twelve;
        nine.child=thirteen;
        twelve.child=fifteen;
        thirteen.child=sixteen;

        node.flattenLL_meth_1(head);
        node.flattenLL_meth_2(head);
        node.print(head);

    }
}


