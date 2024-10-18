
    import java.util.ArrayList;

    public class Adjacency_Un_Weighted  {
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
            graph[0].add(new Edge(0,2));

            graph[1].add(new Edge(1,2));
            graph[1].add(new Edge(1,3));

            graph[2].add(new Edge(2,0));
            graph[2].add(new Edge(2,1));
            graph[2].add(new Edge(2,3));

            graph[3].add(new Edge(3,1));
            graph[3].add(new Edge(3,2));


        }
        public static void main(String[]args){
            int V = 4;
            ArrayList<Edge> graph[]=new ArrayList[V];
            creatGraph(graph);

            System.out.println("Neighbour of 2");

            for (int i=0 ; i<graph[2].size();i++){
                Edge e = graph[2].get(i);
                System.out.println(e.dest);
            }
            System.out.println("Neighbour of 1");
            for (int i=0 ; i<graph[1].size();i++){
                Edge e = graph[1].get(i);
                System.out.println(e.dest);
            }

        }
    }


