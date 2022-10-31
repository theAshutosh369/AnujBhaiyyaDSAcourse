package ANUJ_BHAIYYA.Stack;

class Mystack
{
    static int top ,capacity ;
    static int[] a;
    public Mystack(int capacity )
    {
        top=-1;
        a = new int[capacity];
        this.capacity=capacity;
    }

     void push(int data)
    {
        if( top ==capacity-1 )
        {
            System.out.println("OVERFLOW !!! kya kr rha hai tu !!! ");
        }
        else {
            top++;
            a[top] = data;
        }
    }

     int pop()
    {
        if( top==-1)
        {
            System.out.println("UNDERFLOW !! sorry bhai koi nahi hai !! ");
            return -1;
        }
        else {
            int topelement = a[top];
            top--;
            return topelement;
        }
    }

     int peek()
    {
        if( top==-1)
        {
            System.out.println("Empty ahe bhava !!! ");
            return -1;
        }
        else {
            int topelement = a[top];
            return topelement ;
        }
    }

     void printStackfromBottomToTop( )
    {
        if( top==-1) System.out.println("EMPTY stack ");
        else {
            for (int i = 0; i <= top; i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}


public class stack_implementation_using_arrays {

    public static void main(String[] args) {
        Mystack s = new Mystack(100);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        s.printStackfromBottomToTop();
        s.pop();
        s.printStackfromBottomToTop();
        System.out.println( s.peek());


    }
}
