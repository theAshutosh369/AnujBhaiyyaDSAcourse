package ANUJ_BHAIYYA.Arrays;

// Given a sorted array A (sorted in ascending order),
// having N integers, find if there exists any pair of
// elements (A[i], A[j]) such that their sum is equal to X.


import java.util.Arrays;

public class two_Pointer_technique
{

    static void isPairSum( int[] arr , int n , int sum )
    {
        Arrays.sort( arr );
        int i=0;
        int j=n-1;
        while (i<j)
        {
            if( arr[i]+arr[j] == sum )
            {
                System.out.println( arr[i]+ " "+ arr[j]);
                return;
            }
            else if( arr[i]+arr[j] < sum  ) i++;
            else j--;
        }

        // TC : O ( n log n  )
        // SC : O ( 1 )
    }
    public static void main(String[] args)
    {
        int arr[] = { 2, 3, 5, 8, 9, 10, 11 };
        int sum = 17;
        int n = arr.length;

        isPairSum( arr , n , sum );
    }
}
