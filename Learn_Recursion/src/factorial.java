import java.util.Scanner;

public class factorial {
    public static void CalculateFactorial(int i , int n , int fact ){
        if(i==n){
            fact*=i;
            System.out.println(fact);
            return;
        }
        fact*=i;
        CalculateFactorial(i+1,n,fact);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        CalculateFactorial(1,n,1);
    }
}
