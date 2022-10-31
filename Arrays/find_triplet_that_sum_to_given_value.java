package ANUJ_BHAIYYA.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class find_triplet_that_sum_to_given_value {

    static void find3Numbers( int[] arr , int n , int sum )
    {

        for (int i = 0; i < n-1; i++) {

            Set<Integer> st = new HashSet<>();
            int t1 = sum-arr[i];

            for (int j = i+1; j < n; j++)
            {
                int t2 = t1-arr[j];
                if( st.contains( t2 ))
                {
                    System.out.println(" triplet for "+ sum + " is : "+ t1 + " " + arr[i]+ " " + t2);
                }
                st.add( arr[j]);
            }
        }

        // TC : O ( n^2 )
        // SC : O ( n )

    }

    static void findTriplet( int[] arr , int n , int sum )
    {

        // two pointer technique

        Arrays.sort( arr );
        for (int i = 0; i < n-2; i++)
        {
            int l = i+1;
            int r = n-1;
            while ( l<r )
            {
                if( arr[i]+arr[l]+arr[r]==sum )
                {
                    System.out.println(" triplet for "+ sum + " is : "+ arr[l] + " " + arr[i]+ " " + arr[r] );
                    return;
                }
                else if( arr[i]+arr[l]+arr[r]<sum )
                {
                    l++;
                }
                else {
                    r--;
                }
            }

        }

        // TC : O ( n^2 )
        // SC : O ( 1 )
    }
    public static void main(String[] args) {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int n = A.length;

        find3Numbers(A, n, sum);
        findTriplet(A, n, sum);
    }
}
