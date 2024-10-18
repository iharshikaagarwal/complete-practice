import java.util.ArrayList;

public class Cycle_detection {
//    complete explanation or dry of code in Cycle_detection.text
    static class Edge{
        int src;
        int destination;
        Edge(int s , int d){
            this.src=s;
            this.destination=d;
        }
    }
    public static void CreateGraph(ArrayList<Edge>graph[]){
        for (int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));



    }
    public static boolean isCycle(ArrayList<Edge>graph[],boolean vis[],int curr,boolean rec[] ){
        vis[curr]=true;
        rec[curr]=true;
        for (int i=0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if (rec[e.destination]){
                return true;

            } else if (!vis[e.destination]) {
                if(isCycle(graph,vis,e.destination,rec)){
                    return true;
                }
            }
        }
        rec[curr]=false;
        return false;

    }
    public static void main(String[]args){
        int V =4;
        ArrayList<Edge>graph[]=new ArrayList[V];
        CreateGraph(graph);
//        System.out.println(isCycle(graph,new boolean[V],0,new boolean[V]));

//       yhe comment out ki jagha yeh niche likha hua likho toh better hai
//        kyuki agar an joined graph ho toh problem nhi aati hai
        boolean vis[]=new boolean[V];
        boolean rec[]= new boolean[V];
        for (int i=0;i<V;i++){
            if (!vis[i]){
                boolean isCycle = isCycle(graph,vis,0,rec);
                if (isCycle){
                    System.out.println(isCycle);
                    break;
                }
            }
        }
    }
}
