package ANUJ_BHAIYYA.DP;

public class knapsack_0_1 {

    public static void main(String[] args)
    {
        int w =40;
        int[] wt = { 30 , 10 ,40 , 20};
        int n = wt.length;
        int[] p = { 10 , 20 , 30 , 40 };

        int[][] dp = new int[n+1][w+1];

//        for (int i = 0; i <=w; i++) {
//            dp[0][i] =0;
//        }
//        for (int i = 0; i <=n; i++) {
//            dp[i][0] =0;
//        }

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j<=w ; j++)
            {
                if( j<wt[i-1] ) dp[i][j] = dp[i-1][j];
                else {
                    dp[i][j] = Math.max(  dp[i-1][j] , dp[i-1][j-wt[i-1]] + p[i-1]);
                }
            }
        }

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j<=w ; j++)
            {
                System.out.print( dp[i][j] +" ");
            }
            System.out.println();
        }


        System.out.println("++++++++++++++++++++++");
        System.out.println( dp[n][w] );

    }
}
