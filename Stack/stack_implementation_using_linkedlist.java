package ANUJ_BHAIYYA.Stack;

class mystack {
    static Node head ;
    static int size ;

    mystack()
    {
        head=null;
        size=0;
    }

    public void print(Node head)
    {
        Node n = head;
        while (n!=null)
        {
            System.out.print(n.data+"-->");
            n=n.next;
        }
        System.out.println("null");
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

   public static void push( int data)
    {
        Node temp = new Node(data);
        temp.next=head;
        head=temp;
        size++;
    }
    public static int peek()
    {
        if( size==0 )
        {
            System.out.println("Empty stack !");
            return -1;
        }
        else {
            return head.data;
        }
    }
    public static int pop()
    {
        if( size==0) {
            System.out.println("underflow !");
            return -1;
        }
        else {
            int res = head.data;
            size--;
            head=head.next;
            return res;
        }
    }


}

class stack_implementation_using_linkedlist {

    public static void main(String[] args)
    {
        mystack m = new mystack();
        m.push(10);
        m.push(20);
        m.push(30);
        m.push(40);
        m.push(50);

        m.print(m.head);
        System.out.println( "top element : " + m.peek());
        System.out.println( "popped element is : " + m.pop());
        m.print(m.head);
        System.out.println( "size : "+ m.size);
    }
}
