package ANUJ_BHAIYYA.Tree;

import java.util.*;

public class sec_last {

    static long fact( long n )
    {
        if( n==0 ) return 1 ;
        return n*fact(n-1);
    }
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {

            long mod = 998244353;
            long n = s.nextInt();
            long m = s.nextInt();

            long p = n+m-1 ;

            if( p%2==0 ) {

                long ans = (  (fact(n + m - 2) % mod) / ((fact(n - 1) % mod) * (fact(m - 1) % mod)) % mod ) % mod;

                long cal = ((fact(p) % mod / ((fact(p / 2) % mod) * (fact(p / 2) % mod)) % mod) % mod )*p;

                System.out.println(   ((ans % mod) * (cal % mod)) % mod  );

            }
            else System.out.println(0);


        }
        s.close();
        //-------------------------------------------


    }
}
