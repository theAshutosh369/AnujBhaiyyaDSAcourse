package ANUJ_BHAIYYA.Starting;


public class trapping_rainwater_problem {

    static int rain( int[] arr , int n )
    {
        int[] left= new int[n];
        left[0] = arr[0];

        int[] right = new int[n];
        right[n-1] = arr[n-1];

        for (int i = 1; i < n; i++) {
            left[i] = Math.max( arr[i] , left[i-1]);
        }

        for (int i = n-2; i >= 0; i-- ) {
            right[i] = Math.max( arr[i] , right[i+1]);
        }

        int ans =0;
        for (int i = 0; i < n; i++)
        {
            ans = ans+  Math.min( left[i] , right[i]) - arr[i];
        }

        return ans;
    }
    public static void main(String[] args)
    {

        int[] arr = { 3,1,2,4,0,1,3,2};
        System.out.println( rain(arr, arr.length) );

    }
}
