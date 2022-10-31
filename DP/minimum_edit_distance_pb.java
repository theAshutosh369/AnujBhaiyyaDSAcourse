package ANUJ_BHAIYYA.DP;

public class minimum_edit_distance_pb {
    static int MED( int m , int n , String s1 , String s2 )
    {
        int dp[][] = new int[m+1][n+1];
        for (int i = 1; i <=m; i++)
        {
            dp[i][0] = i;
        }
        for (int i = 1; i <=n; i++)
        {
            dp[0][i] = i;
        }

        for (int i = 1; i <=m ; i++)
        {
            for (int j = 1; j <=n ; j++)
            {
                if( s1.charAt(i-1)==s2.charAt(j-1) )
                {
                    dp[i][j] = dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = 1 + Math.min(  Math.min( dp[i-1][j] , dp[i][j-1] ) , dp[i-1][j-1]  ) ;
                }
            }
        }
        for (int i = 0; i <=m ; i++)
        {
            for (int j = 0; j <=n ; j++)
            {
                System.out.print( dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[m][n];

    }

    public static void main(String[] args)
    {
        String s1 = "abcab" , s2 = "eacb";
        int m = s1.length() , n = s2.length();

        System.out.println("Ans : " + MED( m , n , s1 ,s2 ) );

    }
}


