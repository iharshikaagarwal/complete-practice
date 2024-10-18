import java.util.Stack;

public class reverseAstack{
    public static void pushatbottom (int data , Stack<Integer>s){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbottom(data,s);
        s.push(top);
    }
    public static void reversethestack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reversethestack(s);
        pushatbottom(top , s);
    }


    public static void main(String[]args){
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        reversethestack(s);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}

