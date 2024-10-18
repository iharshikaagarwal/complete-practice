import java.util.*;

public class switchunderstanding {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button){
            case 1 :
                System.out.print("hello");
                break;
            case 2 :
                System.out.print("namstai");
                break;
            case 3:
                System.out.print("bounjore");
                break;
            default:
                System.out.print("invalid button");
                break;
        }
    }
}
