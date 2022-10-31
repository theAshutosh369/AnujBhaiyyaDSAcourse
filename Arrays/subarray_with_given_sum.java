package ANUJ_BHAIYYA.Arrays;

public class subarray_with_given_sum {

    static void subArraySum(int[] arr,int  n,int  sum)
    {
        for (int i = 0; i < n; i++)
        {
            int s = 0;
            for (int j = i; j <n ; j++)
            {
                s=s+arr[j];
                if( s==sum ) System.out.println("subarray of sum "+sum+" found stratig index : " + i+ " and ending index : "+ j);
                else if( s>sum ) {
                    break;
                }
            }
        }

        // TC : O ( n^2 )
        // SC : O ( 1 )
    }

    static void subArraySum2(int[] arr,int  n,int  sum)
    {
        int s =arr[0];
        int l = 0;
        for (int i = 1; i <= n; i++)
        {
            if( s>sum ){
                s=s-arr[l];
                l++;
            }
            if( s==sum )
            {
                System.out.println(l+" "+ (i-1) );
                return;
            }
            if( s<sum ){
                s=s+arr[i];
            }
        }

        // TC : O ( n )
        // SC : O ( 1 )
    }
    public static void main(String[] args)
    {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        subArraySum(arr, n, sum);

        System.out.println("++++++++++++");
        subArraySum2( arr, n, sum );

    }
}
