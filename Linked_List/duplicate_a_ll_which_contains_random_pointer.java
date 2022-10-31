package ANUJ_BHAIYYA.Linked_List;

public class duplicate_a_ll_which_contains_random_pointer {

    static Node head = null;

    static class Node {
        int data ;
        Node next ;
        Node random ;
        Node(int data)
        {
            this.data = data;
            this.next=null;
            this.random = null;
        }
    }

    static void printOriginal( Node head)
    {
        Node n = head;
        while (n!=null)
        {
            System.out.print(n.data+"-->");
            n = n.next;
        }
        System.out.println("null");
    }


    static void printDuplicate( Node head)
    {
        Node n = head;
        while (n!=null)
        {
            System.out.print(n.data+"-->");
            n = n.random;
        }
        System.out.println("null");
    }

    static Node duplicate( Node head)
    {


        // inserting duplicate elements in the ll
        Node cur = head;
        while ( cur!=null)
        {
            Node temp = cur.next;
            cur.next = new Node( cur.data);
            cur.next.next = temp;
            cur=temp;
        }

        // setting random pointers of duplicate elements
        cur=head;
        while (cur!=null)
        {
            if( cur.next!=null)
            {
                if( cur.random!=null) cur.next.random = cur.random.next;
                else cur.next.random = null;
            }
            cur=cur.next.next;
        }

        // separating original and duplicate ll
        Node org = head;
        Node copy = head.next;
        Node temp = copy ;
        while (org!=null)
        {
            org.next=org.next.next;
            copy.next= (copy.next!=null) ? copy.next.next : copy.next;
            org=org.next;
            copy=copy.next;
        }
        return temp;  // returning head of the copy ll

    }


    public static void main(String[] args){
        duplicate_a_ll_which_contains_random_pointer ll = new duplicate_a_ll_which_contains_random_pointer();

        Node head = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);

        head.next = a ;
        a.next=b;
        b.next=c;
        c.next=d;
        // 10-20-30-40-50-null


        head.random=d;
        d.random=a;
        a.random=c;
        c.random=b;
        b.random=null;
        // 10-50-20-40-30-null

        Node duplicate_ka_head = duplicate(head);

        printOriginal(head);
        printDuplicate( duplicate_ka_head );









    }

}
