import java.util.*;
public class conditionproblem {
    public static void main (String[]args){
        System.out.println("type your number");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("it is an even number");
        }
        else {
            System.out.println("odd number");
        }
    }

}


