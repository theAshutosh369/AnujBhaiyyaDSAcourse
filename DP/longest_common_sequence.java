package ANUJ_BHAIYYA.DP;

public class longest_common_sequence {

    static int lcs( int m , int n , String s1 , String s2 )
    {
        int dp[][] = new int[m+1][n+1];
        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <=n ; j++) {
                dp[i][j] = -1;
            }
        }
        int ans = lcsUtil( m , n , s1 , s2 , dp);

        for (int i = 0; i <= m ; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print( dp[i][j]+ " ");
            }
            System.out.println();
        }
        return ans;
    }
    static int lcsUtil( int m , int n , String s1, String s2 , int dp[][] )
    {
        if( m==0 || n==0 ) return dp[m][n] = 0;

        if( dp[m][n] != -1 )
        {
            return dp[m][n];
        }

        if( s1.charAt(m-1) == s2.charAt(n-1) )
        {
            dp[m][n] = 1+ lcsUtil( m-1 , n-1 , s1 ,s2 ,dp );
            return dp[m][n];
        }
        else {
            return dp[m][n] = Math.max( lcsUtil( m , n-1 , s1 ,s2 ,dp ) , lcsUtil( m-1 , n , s1 ,s2 ,dp )) ;
        }
    }

    static int lcs_BU_approach( int m , int n , String s1 , String s2 )
    {
        int dp[][] = new int[m+1][n+1];

        for (int i = 1; i <=m  ; i++) {
            for (int j = 1; j <=n; j++) {

                if( s1.charAt(i-1)==s2.charAt(j-1) )
                {
                    dp[i][j] = dp[i-1][j-1]+1 ;
                }
                else {
                    dp[i][j] = Math.max( dp[i-1][j] , dp[i][j-1] );
                }
            }
        }

        for (int i = 0; i <= m ; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print( dp[i][j]+ " ");
            }
            System.out.println();
        }
        return dp[m][n];
    }
    public static void main(String[] args) {

        String s1 = "abcab";
        String s2 = "aecb";
        int m = s1.length() , n = s2.length();

        System.out.println("Top down approach : ");
        System.out.println("Ans : " + lcs( m , n , s1 ,s2 ) );

        System.out.println();

        System.out.println("Bottom up approach : ");
        System.out.println("Ans : " + lcs_BU_approach( m , n , s1 ,s2 ));
    }
}
