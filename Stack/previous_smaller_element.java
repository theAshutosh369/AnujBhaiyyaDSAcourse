package ANUJ_BHAIYYA.Stack;

import java.util.Stack;

public class previous_smaller_element {
    public static void main(String[] args) {

        int arr[] = { 4 ,10 , 5 , 8 , 20 , 15 , 3, 12 };
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++)
        {
            while ( !s.isEmpty() && s.peek()>=arr[i] )
            {
                s.pop();
            }
            if(s.isEmpty()) System.out.print(-1 + " ");
            else System.out.print( s.peek() +" ");
            s.push(arr[i]);
        }


    }
}
