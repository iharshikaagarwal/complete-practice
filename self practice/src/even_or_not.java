import java.util.*;
public class even_or_not {
    public static boolean CheckEvenOrNot(int n){
        if (n%2==0){
            System.out.println("the number is even");
            return true;
        }
        else {
            System.out.println("the number is prime");
            return false;
        }

    }
    public static void main (String[]args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        CheckEvenOrNot(n);
    }
}
