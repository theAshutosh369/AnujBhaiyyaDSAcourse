package ANUJ_BHAIYYA.Arrays;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class random {
    static long fact( long n  )
    {
        long ans = 1;
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        Map<Integer,Integer> mp = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            if( mp.containsKey(arr[i]) )
            {
                mp.put( arr[i] , mp.get(arr[i])+1 );
            }
            else {
                mp.put( arr[i] , 1 );
            }
        }

        long last =0 , lastvalue=0 ,first=0 , firstvalue=0;
        for ( Map.Entry<Integer,Integer> e : mp.entrySet())
        {
            last=e.getKey();
            lastvalue=e.getValue();
            if(first==0)
            {
                first=e.getKey();
                firstvalue=e.getValue();
            }

        }

        long maxdiff= last-first , ways;

        if( first==last )
        {
            ways = fact( firstvalue ) / ( fact(firstvalue-2) *( fact(2) )) ;
        }
        else {
            ways = lastvalue*firstvalue;
        }


        System.out.println( maxdiff + " " + ways );

    }
}
