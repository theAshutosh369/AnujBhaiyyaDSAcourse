package ANUJ_BHAIYYA.DP;

import java.util.Arrays;

public class coin_change_problem {

    static int min_coin( int n , int arr[] , int dp[] )
    {
        if( n==0 ) return 0;

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if( n-arr[i] >= 0 )
            {
                int subans = 0;
                if( dp[n-arr[i]] != -1 )
                {
                    subans = dp[n-arr[i]];
                }
                else
                {
                    subans = min_coin( n-arr[i] , arr , dp );
                }

                if( subans!=Integer.MAX_VALUE && subans+1<ans )
                {
                    ans=subans+1;
                }
            }
        }
        dp[n] = ans;
        return ans;
    }
    public static void main(String[] args)
    {
        int n = 18;
        int arr[] = { 7,5,1 };

        int dp[] = new int[n+1];
        Arrays.fill(dp , -1);
        dp[0]=0;

        System.out.println( min_coin(n , arr , dp ) );
    }
}
