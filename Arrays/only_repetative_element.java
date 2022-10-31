package ANUJ_BHAIYYA.Arrays;


// We are given an array arr[] of size n. Numbers are from 1 to (n-1)
// in random order. The array has only one repetitive element.
// We need to find the repetitive element.


public class only_repetative_element {

    static int findRepeating(int[] arr)
    {
        int sum =0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println(n*(n-1)/2);

        return sum- ( n*(n-1)/2);

        // TC : O ( n )
        // SC : O ( 1 )
    }
    public static void main(String[] args) {
        int[] arr = { 9, 8, 2, 6, 1, 8, 5, 3, 4, 7 };
        int repeatingNum = findRepeating(arr);
        System.out.println( repeatingNum );
    }
}
