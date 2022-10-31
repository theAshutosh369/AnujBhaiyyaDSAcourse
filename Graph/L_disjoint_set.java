package ANUJ_BHAIYYA.Graph;

public class L_disjoint_set {

    static  int v = 5;   // let there are 5 persons 0,1,2,3,4
    static  int[] parent = new int[v];
    static  int[] rank = new int[v];
     public L_disjoint_set()
    {
        for (int i = 0; i < v  ; i++) {
            parent[i] = i;
        }
    }

    int find( int x )
    {
        if( parent[x] != x )
        {
            parent[x] = find( parent[x]);
        }
        return parent[x] ;
    }

    void union( int x, int y )
    {
        int xroot = find(x);
        int yroot = find(y);

        if( xroot== yroot ) return;
        if( rank[xroot]< rank[yroot] )
        {
            parent[xroot] = yroot;
        }
        else if( rank[yroot]< rank[xroot] )
        {
            parent[yroot] = xroot ;
        }
        else {
            parent[yroot] = xroot;
            rank[xroot] += 1;
        }
    }
    public static void main(String[] args)
    {

        L_disjoint_set ds = new L_disjoint_set();
        ds.union(0,1);  // make 0 and 1 friends
        ds.union(0,2); // make 0 and 2 friends
        ds.union(4,3); // make 4 and 3 friends

        if( ds.find(0)== ds.find(2) )
            System.out.println("yes they are friends ");
        else System.out.println("No they arent friends ");

        if( ds.find(1)== ds.find(3) )
            System.out.println("yes they are friends ");
        else System.out.println("No they arent friends ");

    }
}
