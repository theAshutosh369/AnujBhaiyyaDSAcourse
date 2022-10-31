package ANUJ_BHAIYYA.Starting;

// we are given stock prices on a particular day in an array
// to find maximum profit from buying and selling the stock

public class Maximum_profit {
    public static void main(String[] args) {

        int[] arr = { 2,7,10,1,8,9};

        int min = arr[0];
        int maxprof = 0 ;

        for (int i = 0; i < arr.length; i++)
        {
            min = Math.min ( min , arr[i]);
            int prof = arr[i]-min ;
            maxprof = Math.max( prof , maxprof);
        }
        System.out.println( maxprof);
    }
}

// TC : O(N)
