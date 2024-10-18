import java.util.Stack;

public class queueUsing2stack {
    static class queue{
        static Stack<Integer>s1 = new Stack<>();
        static Stack<Integer>s2 = new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            return s1.pop();
        }

        public static int peek(){
            return s1.peek();
        }

    }
    public static void main(String[]args){
        queue q = new queue();
        q.add(9);
        q.add(8);
        q.add(7);
        q.add(6);
        q.add(5);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
