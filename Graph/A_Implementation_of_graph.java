package ANUJ_BHAIYYA.Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class A_Implementation_of_graph {

    static Scanner s = new Scanner(System.in);
    static void create_undirected_graph_matrix( )
    {
//        edge( 1 , 2);
//        edge( 2 , 4);
//        edge( 3 , 4);
//        edge( 1 , 3);
//        edge( 1 , 4);
//        edge( 2 , 3);
//        edge( 3 , 5);
//        edge( 4 , 5);

          int v = 5;
          int e = 8;
          int[][] a = new int[v+1][v+1];

        for (int i = 0; i < e; i++)
        {
            System.out.print("source :");
            int source = s.nextInt();
            System.out.print("destination :");
            int destination = s.nextInt();

            a[source][destination] = 1;
            a[destination][source] = 1;

        }

        // print the graph

        System.out.println("++++++++++Printing the graph++++++++++++");

        for (int i = 1; i < v+1; i++)
        {
            for (int j = 1; j < v+1; j++)
            {
                System.out.print( a[i][j]+ " ");
            }
            System.out.println();
        }

    }
    static void create_undirectred_graph_adjacency_list()
    {

        int v = 5;
        int e = 8;
        ArrayList< ArrayList<Integer> > arr = new ArrayList<>();
        for (int i = 0; i < v+1; i++)
        {
            arr.add( new ArrayList<>());
        }

        for (int i = 0; i < e; i++)
        {
            System.out.print("source :");
            int source = s.nextInt();
            System.out.print("destination :");
            int destination = s.nextInt();

            arr.get(source).add(destination);
            arr.get(destination).add(source);
        }

        for (int i = 1; i < v+1; i++)
        {
            System.out.print(i + " : ");
            for (int j = 0; j < arr.get(i).size(); j++)
            {
                System.out.print( arr.get(i).get(j)+" " );
            }
            System.out.println();
        }
    }

    static void create_directed_graph_matrix( )
    {
//        edge( 1 , 2);
//        edge( 2 , 4);
//        edge( 3 , 4);
//        edge( 1 , 3);
//        edge( 1 , 4);
//        edge( 2 , 3);
//        edge( 3 , 5);
//        edge( 4 , 5);

        int v = 5;
        int e = 8;
        int[][] a = new int[v+1][v+1];

        for (int i = 0; i < e; i++)
        {
            System.out.print("source :");
            int source = s.nextInt();
            System.out.print("destination :");
            int destination = s.nextInt();

            a[source][destination] = 1;
        }

        // print the graph
        for (int i = 1; i < v+1; i++)
        {
            for (int j = 1; j < v+1; j++)
            {
                System.out.print( a[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void create_directred_graph_adjacency_list()
    {
        int v = 5;
        int e = 8;
        ArrayList< ArrayList<Integer> > arr = new ArrayList<>();
        for (int i = 0; i < v+1; i++)
        {
            arr.add( new ArrayList<>());
        }

        for (int i = 0; i < e; i++)
        {
            System.out.print("source :");
            int source = s.nextInt();
            System.out.print("destination :");
            int destination = s.nextInt();

            arr.get(source).add(destination);
        }

        for (int i = 1; i < v+1; i++)
        {
            System.out.print(i + " : ");
            for (int j = 0; j < arr.get(i).size(); j++)
            {
                System.out.print( arr.get(i).get(j)+" " );
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        create_undirected_graph_matrix();
        create_undirectred_graph_adjacency_list();

        create_directed_graph_matrix();
        create_directred_graph_adjacency_list();
    }
}
