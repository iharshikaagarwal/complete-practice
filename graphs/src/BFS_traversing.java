import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_traversing {
    
        static class Edge{
            int src;
            int dest;
            public Edge(int s,int d){
                this.src=s;
                this.dest=d;

            }
        }
        public static void creatgraph(ArrayList<Edge> graph[]){
            for (int i=0;i<graph.length;i++){
                graph[i]=new ArrayList<Edge>();
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
        public static void BFS(ArrayList<Edge>graph[],int V){
            Queue<Integer> q= new LinkedList<>();
            boolean  []vis= new boolean [V];
            q.add(0);
            while (!q.isEmpty()){
                int curr = q.remove();
                if (vis [curr]==false){
                    //       1 print current
                    System.out.print(curr+" ");
//                    mark that current as true visited
                    vis[curr]=true;
//                    add the current node neighbour in queue

                    for (int i=0 ; i<graph[curr].size();i++){
                        Edge e = graph[curr].get(i);
                        q.add(e.dest);
                    }

                }
            }
        }
        public static void BFS_when_the_sub_graph_is_there(ArrayList<Edge> graph[],int V,boolean vis[], int start){
            Queue<Integer> q= new LinkedList<>();

            q.add(start);
            while (!q.isEmpty()){
                int curr = q.remove();
                if (vis [curr]==false){
                    //       1 print current
                    System.out.print(curr+" ");
//                    mark that current as true visited
                    vis[curr]=true;
//                    add the current node neighbour in queue

                    for (int i=0 ; i<graph[curr].size();i++){
                        Edge e = graph[curr].get(i);
                        q.add(e.dest);
                    }

                }
            }
        }
        public static void main(String[]args){
            int V=7;
            ArrayList<Edge>graph[]=new ArrayList[V];
            creatgraph(graph);
            boolean  []vis= new boolean [V];
            System.out.println("for dubtree bfs");
            for (int i=0;i<V;i++){
                if (vis[i]==false){
                    BFS_when_the_sub_graph_is_there(graph,V , vis ,i);
                    System.out.println();
                }
            }
            System.out.println("for complete tree dfs ");

            BFS(graph,V);
            System.out.println();

        }

    

}
