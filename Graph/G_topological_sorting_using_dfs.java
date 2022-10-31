package ANUJ_BHAIYYA.Graph;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class G_topological_sorting_using_dfs
{

    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    static int v = 6;
    static int e = 8;

    static void create_graph_adjacency_list()
    {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < v; i++)
        {
            arr.add( new ArrayList<>());
        }

        for (int i = 0; i < e; i++)
        {
            int source = s.nextInt();
            int destination = s.nextInt();

            arr.get(source).add(destination);
        }

        for (int i = 0; i < v; i++)
        {
            System.out.print(i + " : ");
            for (int j = 0; j < arr.get(i).size(); j++)
            {
                System.out.print( arr.get(i).get(j)+" " );
            }
            System.out.println();
        }
        System.out.println("==============================");
    }

    static void topological_sort()
    {
        boolean[] visited = new boolean[v];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < v; i++) {
            if( !visited[i] ) dfs( i , arr , visited , s );
        }

        while( !s.isEmpty() )
        {
            System.out.print( s.pop() + " ");
        }

    }

    static void dfs( int source , ArrayList<ArrayList<Integer>> arr , boolean[] visited , Stack<Integer> s )
    {
        visited[ source ] = true;

        for( int neighbour : arr.get(source))
        {
            if( !visited[ neighbour ])
            {
                dfs( neighbour , arr , visited , s );
            }
        }

        s.push( source );
    }
    public static void main(String[] args)
    {
        create_graph_adjacency_list();
        topological_sort();
    }
}
