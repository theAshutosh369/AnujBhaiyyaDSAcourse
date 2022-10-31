package ANUJ_BHAIYYA.Linked_List;

public class palindrome_ll {
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

    static Node middleNode(Node head)
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

    static boolean isPalindrome( Node head )
    {
        Node mid = middleNode(head);
        Node last = reverse(mid);
        Node cur = head;

        while (cur!=null && last!=null)
        {
            if( cur.data!= last.data ) return false;
            cur = cur.next;
            last = last.next;
        }

        return true;
    }

    public static void main(String[] args){
        palindrome_ll ll = new palindrome_ll();

        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.append(20);
        ll.append(10);

        System.out.println("linkedlist is : ");
        print(head);

        System.out.println("Is this linkedlist palindrome ? : " + isPalindrome(head ));


    }
}
