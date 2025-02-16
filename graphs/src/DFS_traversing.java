import java.util.ArrayList;

public class DFS_traversing {




    static class Edge{
        int src;
        //        source
        int dest;
        //        destination
        public Edge (int s , int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]){
        for (int i=0 ;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();

        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));


    }
    public static void  dfs (ArrayList<Edge>  graph [],int curr , boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;
        for (int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if (vis[e.dest]==false)
                dfs(graph,e.dest,vis);

        }
    }

    public static void main(String[]args){
        int V = 7;
        ArrayList<Edge> graph[]=new ArrayList[V];
        creatGraph(graph);
        boolean vis[]=new boolean[V];
        for (int i=0;i<V;i++){
            if (vis[i]==false){
//                for sub trees dfs
                System.out.println("for sub trees dfs");
                dfs(graph,0 , vis);
                System.out.println();
            }
        }
//        System.out.println("for complete tree dfs");
//        dfs(graph,0 , vis);
//        System.out.println();




    }
}




