import java.util.Scanner;

public class greternum {
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter numer a ");
        int a = sc.nextInt();
        System.out.println("enter number b");
        int b = sc.nextInt();

        int print = PrintGreterNumb(a,b);
        System.out.println("the greter number is "+print);

    }
    public static int  PrintGreterNumb(int a,int b){
        return Math.max(a,b);

    }
}
