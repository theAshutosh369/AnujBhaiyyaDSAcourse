package ANUJ_BHAIYYA.Arrays;

public class ceiling_in_sorted_array {

    static int ceil( int[] arr , int key )
    {
        int n = arr.length;
        int l =0 ;
        int h =n-1 ;

        if( key>arr[n-1])
            return -1;
        while( l<h )
        {
            int mid = (l+h)/2;
            if( arr[mid] == key ) return mid;
            else if( arr[mid]<key ) l=mid+1;
            else h=mid-1;
        }
        return l ;

        // TC : O ( log n  )
        // SC : O ( 1 )
    }
    public static void main(String[] args) {

        int arr[] = { 1, 2, 8, 10, 10, 12, 19 };

        int key = 0;
        int index = ceil(arr, key);
        if (index == -1) {
            System.out.println("Ceiling of " + key + " doesn't exist in array");
        }
        else
        {
            System.out.println("ceiling of " + key + " is " + arr[index] );
        }
    }
}
