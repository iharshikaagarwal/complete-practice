import java.util.ArrayList;

public class undirected_cycledetection {




    //    complete explanation or dry of code in Cycle_detection.text
    static class Edge{
        int src;
        int destination;
        Edge(int s , int d){
            this.src=s;
            this.destination=d;
        }
    }
    public static void CreateGraph(ArrayList<Edge> graph[]){
        for (int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<Edge>();
        }
        graph[0].add(new Edge( 0,  1)); 
        graph[0].add(new Edge( 0,  4));

        graph [1].add(new Edge( 1,  0));
        graph [1].add(new Edge( 1,  2));
        graph [1].add(new Edge( 1,  4));

        graph [2].add(new Edge( 2,  1));
        graph [2].add(new Edge( 2,  3));

        graph [3].add(new Edge( 3,  2));

        graph [4].add(new Edge( 4,  0));
        graph [4].add(new Edge( 4,  1));
        graph [4].add(new Edge( 4,  5));

        graph [5].add(new Edge( 5,  4));



    }
    public static boolean isCycleUndirected(ArrayList<Edge>graph[],boolean vis[],int curr,int parent){
        vis[curr]=true;
        for (int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if (vis[e.destination]&& e.destination!=parent){
                return true;
            }
            else if (!vis[e.destination]){
                if (isCycleUndirected(graph,vis,e.destination,curr)){
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[]args){
        int V =6;
        ArrayList<Edge>graph[]=new ArrayList[V];
        CreateGraph(graph);
        System.out.println(isCycleUndirected(graph , new boolean[V],0,-1));



    }
}


