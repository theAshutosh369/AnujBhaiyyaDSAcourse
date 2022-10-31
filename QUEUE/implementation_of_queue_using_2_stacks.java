package ANUJ_BHAIYYA.QUEUE;

import java.util.Stack;

class queueue
{
    static Stack<Integer> s1 = new Stack<>() , s2 = new Stack<>();

    void enqueue( int data )
    {
        s1.push(data);
    }
    int dequeue()
    {
        while ( !s1.isEmpty() )
        {
            s2.push( s1.pop() );
        }
        int ans = s2.pop();
        while ( !s2.isEmpty() )
        {
            s1.push( s2.pop() );
        }
        return ans ;
    }

    int first_ele()
    {
        while ( !s1.isEmpty() )
        {
            s2.push( s1.pop() );
        }
        int ans = s2.peek();
        while ( !s2.isEmpty() )
        {
            s1.push( s2.pop() );
        }
        return ans ;
    }

    void print()
    {
        while ( !s1.isEmpty() )
        {
            s2.push( s1.pop() );
        }
        while ( !s2.isEmpty())
        {
            int ele = s2.pop();
            s1.push( ele );
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
public class implementation_of_queue_using_2_stacks
{
    public static void main(String[] args)
    {
        queueue q = new queueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);

        q.print();
        System.out.println( "Dequeued : "+  q.dequeue() );
        q.print();
        System.out.println( "Peek : " + q.first_ele() );

    }
}
