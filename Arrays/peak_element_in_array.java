package ANUJ_BHAIYYA.Arrays;

public class peak_element_in_array {

    static int findPeak( int[] arr , int n )
    {
        if( arr[0] > arr[1] ) return 0;
        if( arr[n-1]>arr[n-2] ) return n-1;
        for (int i = 1; i < (n-1); i++)
        {
            if( arr[i]>=arr[i-1] && arr[i]>=arr[i+1]  )
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 20, 4, 1, 0 };

        System.out.println( findPeak( arr , arr.length ) );
    }
}
