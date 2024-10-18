import java.util.ArrayList;
import java.util.Stack;

public class TROPOLGICAL_ORDER {
    static class Edge{
        int src;
        int dest;
        Edge(int s , int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void CreatGraph(ArrayList<Edge>graph[]){
        for (int i=0;i< graph.length;i++){
            graph[i]= new ArrayList<Edge>();

        }
        graph[0].add(new Edge(2,3));

        graph[0].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));


    }
    public static void TropoSortingUtil(ArrayList<Edge>graph[], int curr , boolean visited[], Stack<Integer>stack){
        visited[curr]= true;
        for (int i=0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]){
                TropoSortingUtil(graph,e.dest,visited,stack);
            }
        }
        stack.push(curr);
    }
    public static void TropoSort(ArrayList<Edge>graph[],int V){
        boolean visited[] = new boolean [V];
        Stack<Integer>stack = new Stack<>();
        for (int i=0 ;i<V;i++){
            if (!visited[i]){
                TropoSortingUtil(graph,i, visited ,stack);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
    public static void main(String[]args){
        int V=6;
        ArrayList<Edge>graph[]=new ArrayList[V];
        CreatGraph(graph);
        TropoSort(graph,V);
    }

}
