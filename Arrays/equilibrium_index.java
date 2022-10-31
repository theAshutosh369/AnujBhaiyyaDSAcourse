package ANUJ_BHAIYYA.Arrays;

// Equilibrium index of an array is an
// index such that the sum of elements at
// lower indexes is equal to the sum of elements at higher indexes.


public class equilibrium_index {

    static int equilibrium( int[] arr , int n )
    {
        int sum =0;
        int leftsum =0 ;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }

        for (int i = 0; i < n; i++)
        {
            sum = sum - arr[i];
            if( leftsum==sum ) return i;
            leftsum = leftsum + arr[i];
        }
        return -1;

        // TC : O ( n )
        // SC : O ( 1 )
    }

    public static void main(String[] args)
    {
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        int n = arr.length;
        System.out.println("First equilibrium index is " + equilibrium(arr, n));
    }

}
