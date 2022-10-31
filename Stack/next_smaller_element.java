package ANUJ_BHAIYYA.Stack;

import java.util.Stack;

public class next_smaller_element {
    public static void main(String[] args) {

        int arr[] = { 3 , 10 , 5 ,1 , 15, 10 , 7 ,6 };
        int ans[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length-1; i>=0 ; i--)
        {
            while ( !s.isEmpty() && s.peek()>=arr[i] )
            {
                s.pop();
            }
            if(s.isEmpty()) ans[i]=-1;
            else ans[i]= s.peek();
            s.push(arr[i]);
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(ans[i]+" ");
        }


    }
}
