import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        System.out.println("enter a day");

        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();

        switch (n){
            case 1 :
                System.out.println("rest day");
                break;
            case 2:
                System.out.println("work day ");
                break;
            case 3:
                System.out.println("presantation day");
                break;
            default:
                System.out.println("fun day");
                break;
        }
    }
}
