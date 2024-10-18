import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type value of a");
        int a = sc.nextInt();
        System.out.println("type teh value of b");
        int b = sc.nextInt();
        if (a==b){
            System.out.println(" a & b are equal");

        }
        else if (a>b){
            System.out.println("a is gretor");
        }
        else {
            System.out.println("b is gretor");
        }

    }
}