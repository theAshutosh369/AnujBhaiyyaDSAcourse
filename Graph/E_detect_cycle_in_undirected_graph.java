package ANUJ_BHAIYYA.Graph;


import java.util.ArrayList;
import java.util.Scanner;

public class E_detect_cycle_in_undirected_graph
{
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    static int v = 9;
    static int e = 7;
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
        System.out.println("==============================");
    }

    static boolean raw_detect()
    {
        boolean[] visited = new boolean[v];

        for (int i = 0; i < v; i++) {
            if( detect_cycle( i , arr , visited , -1 ))
                return true;
        }
        return false;
    }

    static boolean detect_cycle( int source , ArrayList<ArrayList<Integer > > arr , boolean[] visited , int parent )
    {
        visited[source] =true;

        for ( Integer neighbour : arr.get(source) )
        {
            if( !visited[neighbour] )
            {
                if(detect_cycle( neighbour , arr , visited , source ) )
                    return true;
            }
            else {
                if( parent != neighbour )
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        create_graph_adjacency_list();
        System.out.println( "Is any cycle present in the graph ? : " + raw_detect() );
    }
}
