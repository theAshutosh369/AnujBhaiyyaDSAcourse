package ANUJ_BHAIYYA.Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class stack
{
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    void push( int data )
    {
        while (!q1.isEmpty())
        {
            q2.add( q1.remove() );
        }
        q1.add( data);
        while ( !q2.isEmpty() )
        {
            q1.add( q2.remove());
        }
    }

    int pop()
    {
        return q1.remove();
    }

    int peek()
    {
        return q1.element();
    }

    void print()
    {
        while (!q1.isEmpty())
        {
            q2.add( q1.remove() );
        }
        while (!q2.isEmpty())
        {
            int temp = q2.poll();
            System.out.print(temp+" ");
            q1.add( temp );
        }
        System.out.println();

    }

}
public class implementaion_of_stack_using_2_queues {
    public static void main(String[] args)
    {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        s.print();
        System.out.println( s.pop() );
        s.print();

    }
}
