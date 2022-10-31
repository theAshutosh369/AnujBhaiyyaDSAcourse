package ANUJ_BHAIYYA.Arrays;

import java.util.HashMap;
import java.util.Map;

public class majority_element {
    static int maj_element( int[] arr , int n )
    {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if( mp.containsKey(arr[i]) )
            {
                mp.put( arr[i] , mp.get(arr[i])+1 );
            }
            else
            {
                mp.put( arr[i] , 1 );
            }
        }

        for(Map.Entry<Integer , Integer> e : mp.entrySet() )
        {
            if( e.getValue()> (n/2))
            {
                return e.getKey();
            }
        }
        return -1 ;

        // TC : O ( n )
        // SC : O ( n )
    }
    public static void main(String[] args) {
        int a[] = new int[]{2,2,2,2,5,5,2,3,3};

        System.out.println( maj_element( a , a.length ) );
    }
}
