package ANUJ_BHAIYYA.Linked_List;

public class Cycle_detection_in_ll {

    static Node head = null;

    static class Node {
        int data ;
        Node next ;
        Node(int data)
        {
            this.data = data;
            this.next=null;
        }
    }

    void append( int data)
    {
        Node nn = new Node(data);
        if( head==null) {
            head=nn;
            return;
        }
        Node n = head;
        while( n.next!=null)
        {
            n=n.next;
        }
        n.next=nn;
    }

    static void print( Node head)
    {
        Node n = head;
        while (n!=null)
        {
            System.out.print(n.data+"-->");
            n = n.next;
        }
        System.out.println("null");
    }

    static Node CycleBeginNode( Node head)
    {
        Node meet = detectCycle(head);
        Node cur = head;

        while (meet!=cur)
        {
            cur= cur.next;
            meet=meet.next;
        }
        return cur;
    }

    static Node detectCycle( Node head)
    {
        Node s = head;
        Node f = head;

        while( f!=null && f.next!=null)
        {
            s=s.next;
            f = f.next.next;
            if( f==s ) {
                return s ;
            }
        }
        return null;
    }


    public static void main(String[] args){
        Cycle_detection_in_ll ll = new Cycle_detection_in_ll();

        Node head = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);
        Node e = new Node(60);

        head.next = a ;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=b;

        // cant print the ll coz it will fall in infinite loop

        System.out.print("Is there a cycle present in the ll ? : ");
        if( detectCycle(head)!=null ) {
            System.out.println("YES");
            System.out.println("Node where slow and fast met is : " + detectCycle(head).data);
            System.out.println("cycle begin node is : "+ CycleBeginNode(head).data );

        }
        else {
            System.out.println("NO");
        }

    }

}
