package ANUJ_BHAIYYA.Graph;

public class H_create_Weighted_graph {

    static int v=5, e=8;
    static H_create_Weighted_graph g = new H_create_Weighted_graph();


    static class EDGE
    {
        int src , dest , weight;
        EDGE()
        {
            src=dest=weight=0;
        }
    }
    final private EDGE[] edge;
    H_create_Weighted_graph()
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
        g.edge[6].weight = -1;

        g.edge[7].src = 4;
        g.edge[7].dest = 3;
        g.edge[7].weight = -3;

        print();
    }
}
