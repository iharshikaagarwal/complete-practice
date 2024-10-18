import java.util.Stack;

public class reverseArrayUsingStack {
    public static void reversearray(int array[]){
        Stack<Integer>s=new Stack<>();
        for (int i : array){
            s.push(i);
        }
        for (int i = 0 ; i <array.length;i++){
            array[i]=s.pop();
        }
    }
    public static void main(String[]args){
        int originalarray[]={5,9,6,5,4,9};
        reversearray(originalarray);
        System.out.println("reversed array");
        for (int i : originalarray){
            System.out.print(i+" ");
        }
    }
}
