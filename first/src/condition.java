import java.util.*;

public class condition {
    public static void main (String[]args){
        System.out.println("type the agre here");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>18){
            System.out.println("yes u are adult u are eligibel for vote");
        }
        else {
            System.out.println(" no u are not eligibel for vote try after 18");
        }
    }
}
