//import java.util.LinkedList;
//import java.util.Queue;
//
//public class coolectionframework {
//    public static void main(String[]args){
//        Queue<Integer> q= new LinkedList<>();
//        q.add(8);
//        q.add(5);
//        q.add(9);
//        q.add(2);
//        q.add(1);
//        while (!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();}
//
//    }
//}





//one more way
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class coolectionframework {
    public static void main(String[]args){
        Queue<Integer> q= new ArrayDeque<>();
        q.add(8);
        q.add(5);
        q.add(9);
        q.add(2);
        q.add(1);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();}

    }
}

