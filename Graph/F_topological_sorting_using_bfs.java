package ANUJ_BHAIYYA.Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class F_topological_sorting_using_bfs {

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

    static ArrayList<Integer> topological_sorting()
    {
        int[] indegree = new int[v];
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < v; i++)
        {
            for ( int j : arr.get(i) )
            {
                indegree[j]++;
            }
        }

        bfs( arr ,  indegree , ans );

        return ans;

    }

    static void bfs( ArrayList<ArrayList<Integer>> arr , int[] indegree  , ArrayList<Integer> ans )
    {
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < v; i++) {
            if( indegree[i]==0 )
            {
                q.add( i );
            }
        }

        while ( !q.isEmpty() )
        {
            int cur = q.poll();
            ans.add( cur );

            for (int neighbour : arr.get(cur) )
            {
                if( --indegree[neighbour] == 0 )
                {
                    q.add( neighbour );
                }
            }
        }

    }
    public static void main(String[] args) {

        create_graph_adjacency_list();
        System.out.println(  topological_sorting() );

    }
}
