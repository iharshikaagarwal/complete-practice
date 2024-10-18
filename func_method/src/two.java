import java.util.*;
public class two {
    public static int CalculateSum(int a ,int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int sum = CalculateSum(a,b);
//        System.out.println(sum);
    }
}
