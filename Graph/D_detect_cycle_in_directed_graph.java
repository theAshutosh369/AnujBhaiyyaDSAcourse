package ANUJ_BHAIYYA.Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class D_detect_cycle_in_directed_graph {


    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    static int v = 5;
    static int e = 5;
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

    static boolean raw_detect()
    {
        boolean[] visited = new boolean[v];
        boolean[] recS = new boolean[v];

        for (int i = 0; i < v; i++) {
            if( detect_cycle( i , arr , visited , recS ))
                return true;
        }
        return false;
    }

    static boolean detect_cycle( int source , ArrayList<ArrayList<Integer > > arr , boolean[] visited , boolean[] recS )
    {
        visited[source] =true;
        recS[source] = true;

        for ( Integer neighbour : arr.get(source) )
        {
            if( !visited[neighbour] )
            {
                if(detect_cycle( neighbour , arr , visited , recS ) )
                    return true;
            }
            else {
                if( recS[neighbour] )
                {
                    return true;
                }
            }
        }
        recS[source] = false;
        return false;
    }

    public static void main(String[] args)
    {
        create_graph_adjacency_list();
        System.out.println( "Is any cycle present in the graph ? : " + raw_detect() );
    }


}
