import java.util.Scanner;

public class febonacci {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in );
        System.out.println("enter a number::");
        int term  = sc.nextInt();
        System.out.println("the fabonacci series of "+ term + "  is:: ");
         FabonacciSeries(term);

    }
    public static void FabonacciSeries(int term){
        int a= 0 ;
        int b =1 ;
        int c;
        for (int i = 0 ; i<term;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }

    }
}
