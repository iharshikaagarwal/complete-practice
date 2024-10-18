import java.util.*;
public class homeworf1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int select = sc.nextInt();

        switch (select){
            case 1:int sum = a+b;
                System.out.println("addition is "+sum);
                break;
            case 2:int sub = a-b;
                System.out.println("subtraction is"+sub);
                break;
            case 3:int mul = a*b;
                System.out.println("multiplication is "+mul);
                break;
            case 4:int div = a/b;
                System.out.println("division is"+div);
                break;
            default:
                System.out.println("invalid selection");
        }

    }
}


