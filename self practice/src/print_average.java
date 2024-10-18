import java.util.Scanner;

public class print_average {
    public static int PrintAverage(int a ,int b ,int c){
        return (a+b+c)/3;


    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg= PrintAverage(a,b,c);
        System.out.println(avg);

    }

}
