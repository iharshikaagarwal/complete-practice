import java.util.*;
public class powerconcept {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x ::");
        double x = sc.nextDouble();
        System.out.println("Enter n ::");
        int n = sc.nextInt();
        double result = PowerRaised(x,n);
        System.out.println(x+ " "+ "power raised "+" "+ n+ " "+ "is:" +" "+result);
    }
    public static  double PowerRaised(double x , int n){
        double result = 1 ;
        if  (n<0){
//            negetive power
            x= 1 / x ;
            n= -n ;
        }
        for (int i = 1 ; i <= n ; i ++ ){
            result =x*result;
        }
        return result;
    }
}
