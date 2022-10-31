package ANUJ_BHAIYYA.Arrays;


// Write a program that, given an array A[] of n numbers
// and another number x, determines whether or not there
// exist two elements in A[] whose sum is exactly x.


import java.util.HashSet;
import java.util.Set;

public class check_for_pair_with_sum_as_x
{

    static void printpairs( int arr[] , int sum )
    {
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++)
        {
            int temp = sum - arr[i];
            if( st.contains(temp) ) System.out.println( "Pair with sum "+ sum + " : " + temp + " " + arr[i] );
            st.add( arr[i] );
        }
        System.out.println( st );

        // TC : O ( n )
        // SC : O ( n )

    }
    public static void main(String[] args)
    {
        int A[] = { 1, 4, 45, 6, 10, 8  , 8 };
        int sum = 16;
        printpairs(A, sum);
    }
}
