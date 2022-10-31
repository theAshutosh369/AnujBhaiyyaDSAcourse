package ANUJ_BHAIYYA.Linked_List;

public class reverse_linekdlist {
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

    static Node reverse(Node head)
    {
        Node cur = head ;
        Node prev = null;
        Node next ;

        while (cur!=null)
        {
            next= cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head= prev;
        return head;
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

    public static void main(String[] args){
        reverse_linekdlist ll = new reverse_linekdlist();

        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);
        ll.append(50);

        System.out.println("Main ll : ");
        print(head);

        Node h = reverse(head);
        print(h);




    }
}
