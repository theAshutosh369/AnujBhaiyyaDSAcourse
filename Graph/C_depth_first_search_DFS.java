package ANUJ_BHAIYYA.Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class C_depth_first_search_DFS {

    static ArrayList< ArrayList<Integer> > arr = new ArrayList<>();
    static int v = 10;
    static int e = 11;
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
            arr.get(destination).add(source);
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
    }
    
    static void raw_dfs( int v)
    {
        int visited[] = new int[v];

        for (int i = 0; i < v; i++) {
            if( visited[i]==0 )
            {
                dfs( arr , visited , i );
            }
        }
    }

    static void dfs( ArrayList< ArrayList<Integer> > arr , int[] visited , int source)
    {
        visited[source] =1;
        System.out.print( source+" ");

        for (int i = 0; i < arr.get(source).size(); i++)
        {
            int n = arr.get(source).get(i);
            if( visited[n]==0 )
            {
                dfs( arr , visited , n );
            }
        }
    }
    public static void main(String[] args)
    {
        create_graph_adjacency_list();
        raw_dfs( v );
    }
}
