import java.util.*;
//print the even number till n

public class seven {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =  1 ; i<n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
