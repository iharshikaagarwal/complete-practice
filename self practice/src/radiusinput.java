import java.util.Scanner;

public class radiusinput {
    public static double CircumfrenceOfCircle(double r ){
        return 2 * 3.14 * r ;
//        here we can also use Math.PI
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        double r = sc.nextDouble();

        double  result= CircumfrenceOfCircle(r);
        System.out.println("the circumfrence of circle is "+result);


    }
}

