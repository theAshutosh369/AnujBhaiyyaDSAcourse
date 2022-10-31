package ANUJ_BHAIYYA.Arrays;


// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//Return the maximum amount of water a container can store.

public class container_with_most_water {

    static int maxArea( int[] height )
    {
        int n = height.length;
        int l = 0 ;
        int r = n-1;
        int maxarea = Integer.MIN_VALUE;
        while (l<r )
        {
            int left_h = height[l];
            int right_h = height[r];
            int width = r-l;
            int min_h = Math.min(left_h, right_h);

            int area = width * min_h;
            maxarea = Math.max(maxarea, area);
            if (left_h < right_h) l++;
            else r--;
        }

        return maxarea;

        // TC : O ( n )
        // SC : O ( 1 )
    }
    public static void main(String[] args) {
        int arr[] = { 1,8,6,2,5,4,8,3,7 };
        System.out.println( maxArea( arr )  );
    }
}
