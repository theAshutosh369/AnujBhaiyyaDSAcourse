package ANUJ_BHAIYYA.QUEUE;

class queue
{
    int n , a[] ;
    int rear=-1 , front=-1;

    queue( int n)
    {
        this.n=n;
        a = new int[n];
    }

    public void enqueue( int data)
    {
        if( (rear+1)% n == front )
        {
            System.out.println("Queue full hua hai bhai !! ");
            return;
        }
        if( front==-1 )
        {
            front=0;
        }
        rear= (rear+1)%n;
        a[rear]=data;

    }
    public int dequeue()
    {
        if( front==-1 )
        {
            System.out.println("queue hi khali hai kya nikalega tu hatt !!");
        }
        int front_ele = a[front];

        if( front==rear )
        {
            front=rear=-1;
        }
        else {
            front = (front+1)%n ;
        }

        return front_ele;

    }

    public void print()
    {
        if(front == -1)
        {
            System.out.println("Queue is Empty");
            return;
        }
        if(front<=rear) {
            for (int i = front; i <= rear; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        else {
            for(int i = front; i < n; i++)
            {
                System.out.print(a[i]+" ");
            }
            for(int i = 0; i <= rear; i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }

}
public class implementation_of_queue_using_circular_array {
    public static void main(String[] args) {
        queue q = new queue(10);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.enqueue(90);
        q.enqueue(100);

        q.print();
        q.dequeue();
        q.print();
        q.dequeue();
        q.print();
        q.dequeue();
        q.print();
        q.dequeue();
        q.print();
        q.dequeue();
        q.print();
        q.dequeue();
        q.print();
        q.dequeue();
        q.print();
        q.dequeue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.print();


    }
}
