package ANUJ_BHAIYYA.Starting;

// to find maximum sum subarray from a given array

import java.util.Scanner;

public class kadanes_algo {

    static int kadane( int arr[] )
    {
        int maxsum =0 ;
        int cursum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            cursum = cursum + arr[i];
            if( cursum > maxsum) maxsum = cursum ;
            if( cursum <0 ) cursum=0;
        }
        return maxsum;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println( kadane(arr));

    }
}

// TC : O(n)
