package ANUJ_BHAIYYA.Tree;

import java.util.*;

public class A {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            int p , q ;
            if( n%2==0 )
            {
                p=n/2 -1;
                q= n/2 ;
            }
            else {
                p = n/2 -1 ;
                q = n/2 +1 ;
            }
            int ans = 0 , add=0;
            boolean f= true;
            for (int i = p , j = q ; i>=0  ; i-- , j++)
            {
                arr[i] = arr[i]+add;
                if( arr[i]< arr[j] ) {
                    int temp = arr[j]-arr[i];
                    ans = ans + temp ;
                    add = add+temp;
                }
                else if( arr[i]>arr[j])
                {
                    f=false;
                    System.out.println(-1);
                    break;
                }
            }

            if( f )
            {
                System.out.println(ans);
            }



        }
        s.close();
        //-------------------------------------------


    }
}
