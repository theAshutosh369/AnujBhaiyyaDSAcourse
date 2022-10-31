package ANUJ_BHAIYYA.Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class B_breadth_first_search_BFS {

    static ArrayList< ArrayList<Integer> > arr = new ArrayList<>();
    static int v = 5;
    static int e = 8;
    static void bfs( ArrayList< ArrayList<Integer> > arr , int source   )
    {
        int visited[] = new int[v+1];
        Queue<Integer>  q = new ArrayDeque<>();

        visited[source] = 1;
        q.add(source);

        while (!q.isEmpty())
        {
            int cur = q.poll();
            System.out.print(cur+" ");
            for (int i = 0; i < arr.get(cur).size(); i++)
            {
                int n = arr.get(cur).get(i);

                if( visited[n] == 0 )
                {
                    visited[n] = 1;
                    q.add( n );
                }
            }
        }
    }


    static void create_graph_adjacency_list()
    {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < v+1; i++)
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
        create_graph_adjacency_list();

        bfs( arr , 1  ) ;
    }
}
