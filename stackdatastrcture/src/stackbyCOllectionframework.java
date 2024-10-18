import java.util.Stack;

public class stackbyCOllectionframework {
    public static void main(String[]args){
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(4);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
