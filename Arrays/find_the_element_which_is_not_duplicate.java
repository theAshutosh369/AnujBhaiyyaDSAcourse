package ANUJ_BHAIYYA.Arrays;

public class find_the_element_which_is_not_duplicate {

    static int find( int arr[] )
    {
        int ans=0 ;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;

        // TC : O ( n )
        // SC : O ( 1 )
    }
    public static void main(String[] args)
    {
        int[] arr = {7, 3, 5, 4, 5, 3, 4};
        System.out.println( find( arr));
    }
}
