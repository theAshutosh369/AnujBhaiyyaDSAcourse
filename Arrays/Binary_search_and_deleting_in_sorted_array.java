package ANUJ_BHAIYYA.Arrays;

public class Binary_search_and_deleting_in_sorted_array {

    static int BS( int[] arr , int l , int h , int key )
    {
        int mid = (l+h)/2;
        if( l>h ) return -1;
        if( arr[mid]==key ) return mid;
        else if( arr[mid]>key ) return BS( arr , l , mid-1 , key );
        else return BS( arr , mid+1 , h , key );

        // TC (BS) : O ( logn )
        // SC (BS) : O ( logn )
    }


    static int delete( int[] arr ,int n ,  int key)
    {
        int position = BS( arr , 0 , arr.length-1 , key );

        if( position==-1 ) {
            System.out.println("Element is not present in array ! ");
            return n ;
        }

        for (int i = position; i < arr.length-1 ; i++) {
            arr[i] = arr[i+1];
        }

        return n-1;

//        TC of Delete Operation : O(n)
//        SC : O(log n)
    }


    static int insert( int[] arr , int n , int capacity , int key )
    {
        if( n>=capacity ) {
            System.out.println("Capacity is full ! ");
            return n;
        }

        int i;
        for ( i= n-1; ( i>=0 && arr[i]>key ); i--)
        {
            arr[i+1]=arr[i];
        }
        arr[i+1] = key;
        return n+1;

        // TC (insert) : O ( n )
        // SC (insert) : O ( 1 )
    }


    public static void main(String[] args)
    {


        int[] arr = { 5 , 6 ,7 ,8 ,9 , 10 , 13 , 14 };
        int n = arr.length;

        System.out.println("Element 8 is present at index : " + BS( arr , 0 , n-1, 8 ) );

        System.out.println("After deleting the element 8 : " );
        n = delete( arr , n , 8);
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }


        System.out.println();
        int[] brr = new int[20];
        brr[0] = 1;
        brr[1] = 2;
        brr[2] = 3;
        brr[3] = 4;
        brr[4] = 5;
        brr[5] = 6;
        brr[6] = 7;
        brr[7] = 9;
        brr[8] = 10;

        int capacity = brr.length;
        n=9;

        System.out.println("After inserting the element 8 : " );
        n = insert( brr , n , capacity , 8);
        for (int i = 0; i < n; i++)
        {
            System.out.print(brr[i] + " ");
        }




    }
}


