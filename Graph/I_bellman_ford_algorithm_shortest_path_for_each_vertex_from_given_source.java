package ANUJ_BHAIYYA.Graph;

public class I_bellman_ford_algorithm_shortest_path_for_each_vertex_from_given_source {
    static int v=5, e=8;
    static I_bellman_ford_algorithm_shortest_path_for_each_vertex_from_given_source g = new I_bellman_ford_algorithm_shortest_path_for_each_vertex_from_given_source();

    static class EDGE
    {
        int src , dest , weight;
        EDGE()
        {
            src=dest=weight=0;
        }
    }
    final private EDGE[] edge;
    I_bellman_ford_algorithm_shortest_path_for_each_vertex_from_given_source()
    {
        edge = new EDGE[e];

        for (int i = 0; i < e; i++)
        {
            edge[i] = new EDGE();
        }
    }

    static void print()
    {
        System.out.println("source-destination  :  weight ");
        for (int i = 0; i < e; i++) {
            System.out.println( g.edge[i].src + "-"+ g.edge[i].dest + " : " + g.edge[i].weight );
        }
    }

    static void bellman_ford( int src)
    {
        int[] distance = new int[v];

        for (int i = 0; i < v; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[src] =0 ;

        // loop v-1 times chaleyenge kyunki konsa bhi graph ho v-1 th loop tk answer dehi dega
        for (int i = 0; i < v-1; i++)
        {
            for (int j = 0; j < e; j++) {
                int u = g.edge[j].src;
                int v = g.edge[j].dest;
                int w = g.edge[j].weight;

                if( distance[u]!= Integer.MAX_VALUE &&  distance[u]+w < distance[v])
                {
                    distance[v] = distance[u]+w;
                }
            }
        }

        // one more loop for checking if there exist any -ve weight cycle
        for (int j = 0; j < e; j++) {
            int u = g.edge[j].src;
            int v = g.edge[j].dest;
            int w = g.edge[j].weight;

            if( distance[u]!= Integer.MAX_VALUE &&  distance[u]+w < distance[v])
            {
                System.out.println("Graph contains negative weight cycle !! mehnat barbad ... ");
                return;
            }
        }

        for (int i = 0; i < v; i++) {
            System.out.println( i + " : " + distance[i]);
        }


    }

    public static void main(String[] args)
    {

        g.edge[0].src = 0;
        g.edge[0].dest = 1;
        g.edge[0].weight = -1;

        g.edge[1].src = 0;
        g.edge[1].dest = 2;
        g.edge[1].weight = 4;

        g.edge[2].src = 1;
        g.edge[2].dest = 2;
        g.edge[2].weight = 3;

        g.edge[3].src = 1;
        g.edge[3].dest = 3;
        g.edge[3].weight = 2;

        g.edge[4].src = 1;
        g.edge[4].dest = 4;
        g.edge[4].weight = 2;

        g.edge[5].src = 3;
        g.edge[5].dest = 2;
        g.edge[5].weight = 5;

        g.edge[6].src = 3;
        g.edge[6].dest = 1;
        g.edge[6].weight = 1;

        g.edge[7].src = 4;
        g.edge[7].dest = 3;
        g.edge[7].weight = -3;

        bellman_ford(0);

    }
}
