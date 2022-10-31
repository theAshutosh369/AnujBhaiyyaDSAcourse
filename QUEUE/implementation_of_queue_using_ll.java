package ANUJ_BHAIYYA.QUEUE;

class Queue{
    static Node front = null , rear = null;
    static class Node
    {
        int data ;
        Node next ;
        Node( int data)
        {
            this.data = data;
            next=null;
        }
    }

     void enqueue( int data)
    {
        Node nn = new Node(data);
        if( front==null)
        {
            front=rear=nn;
        }
        else {
            rear.next = nn ;
            rear = nn;
        }
    }
     int dequeue( )
    {
        if (front==null){
            return -1;
        }
        else {
            int first = front.data;
            front = front.next;
            return first;
        }
    }
     void print( )
    {
        Node n = front;
        while (n!=null)
        {
            System.out.print(n.data+"-->");
            n=n.next;
        }
        System.out.println("null");
    }
}
public class implementation_of_queue_using_ll {
    public static void main(String[] args)
    {

        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.print();

        System.out.println( q.dequeue() );



    }
}
