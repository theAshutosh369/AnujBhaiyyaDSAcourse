package ANUJ_BHAIYYA.Linked_List;

public class find_middle_of_ll {
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

    static Node middleNode( Node head)
    {
        Node s = head;
        Node f = head;
        while( f!=null && f.next!=null)
        {
            f=f.next.next;
            s=s.next;
        }
        return s;
    }

    public static void main(String[] args){
        find_middle_of_ll ll = new find_middle_of_ll();

        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);

        System.out.println("Main ll : ");
        print(head);

        System.out.println();
        System.out.println("Middle node is : "+ middleNode(head).data );


    }
}
