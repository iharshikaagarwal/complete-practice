import java.util.*;
public class three {
    public static void Factorial(int n){
        if (n<0){
            System.out.println("Invalid !!!!");
            return;
        }
        int factorial = 1 ;
        for (int i = n ; i >=1 ; i-- ){
            factorial= factorial*i;
//            System.out.println(factorial);


        }
        System.out.println(factorial);
        return;


    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         Factorial(n);
    }
}

