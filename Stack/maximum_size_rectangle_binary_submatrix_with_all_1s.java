package ANUJ_BHAIYYA.Stack;

import java.util.Stack;

public class maximum_size_rectangle_binary_submatrix_with_all_1s{

    static int answer( int[][] matrix)
    {
        int[] currow = matrix[0];
        int ans = maxarea( currow );
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                if( matrix[i][j]==1 ) currow[j]++;
                else currow[j]=0;
            }
            int cal = maxarea( currow );
            ans = Math.max( cal , ans );
        }
        return ans ;
    }

    static int maxarea( int[] arr  )
    {
        int n = arr.length;
        int[] ps = new int[n];
        int[] ns = new int[n];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++)
        {
            while ( !s.isEmpty() && arr[s.peek()]>=arr[i] )
            {
                s.pop();
            }
            if(s.isEmpty()) ps[i]= -1;
            else ps[i]= s.peek();
            s.push(i);
        }

        s.clear();

        for (int i = n-1; i>=0 ; i--)
        {
            while ( !s.isEmpty() && arr[s.peek()]>=arr[i] )
            {
                s.pop();
            }
            if(s.isEmpty()) ns[i]=n;
            else ns[i]= s.peek();
            s.push(i);
        }

        int maxarea=0;
        for (int i = 0; i < n; i++) {
            int cal = ( ns[i]-ps[i]-1 )*arr[i];
            maxarea = Math.max( maxarea , cal );
        }
        return maxarea;
    }

    public static void main(String[] args)
    {
        int[][] matrix =
                {
                        { 1,1,0,1,1 },
                        { 1,1,1,1,1 },
                        { 0,1,1,1,1 } ,
                        { 1,1,1,1,1 },
                        { 1,0,1,1,1 } ,
                        { 1,1,1,1,1 }
                };
        System.out.println(  answer( matrix)  );
    }
}
