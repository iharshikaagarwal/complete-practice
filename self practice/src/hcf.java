import java.util.*;
public class hcf {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st num ::");
        int a = sc.nextInt();
        System.out.println("enter 2nd number ::");
        int b = sc .nextInt();
        int g = GretestCommonFactor(a,b);
        System.out.println("the gcdof   "+ a +" and " + b+" is "+ g);

    }
    public static int GretestCommonFactor (int a , int b ){
        int g = 0 ;
        for (int i =1 ; i < a ; i++){
            if (a%i==0 && b%i==0 ){
                g=i;
            }
        }
        return g;
    }
}
