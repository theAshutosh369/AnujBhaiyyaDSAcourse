package ANUJ_BHAIYYA.Stack;

import java.util.Stack;

public class largest_rectangle_area_histogram {
    public static void main(String[] args) {

        int[] arr = { 4, 2, 1, 5, 6, 3, 2, 4, 2 };
        int n = arr.length;
        int[] ps = new int[n];
        int[] ns = new int[n];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++)
        {
            while ( !s.isEmpty() && arr[s.peek()]>=arr[i] )
            {
                s.pop();
            }
            if(s.isEmpty()) ps[i]= -1;
            else ps[i]= s.peek();
            s.push(i);
        }

        s.clear();

        for (int i = n-1; i>=0 ; i--)
        {
            while ( !s.isEmpty() && arr[s.peek()]>=arr[i] )
            {
                s.pop();
            }
            if(s.isEmpty()) ns[i]=n;
            else ns[i]= s.peek();
            s.push(i);
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < n ; i++) {
            System.out.print(ps[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < n ; i++) {
            System.out.print(ns[i]+" ");
        }

        int maxarea=0;
        for (int i = 0; i < n; i++) {
            int cal = ( ns[i]-ps[i]-1 )*arr[i];
            maxarea = Math.max( maxarea , cal );
        }
        System.out.println();
        System.out.println("Maximum area rectangle is : " + maxarea);


    }
}
