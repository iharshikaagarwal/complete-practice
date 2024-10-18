import java.util.*;
//here the concept of check the prime number is if the number is divisivel by 1 and itself
//here we learn an new concept of counter !!
public class primeNo {
    public static void CheckPrimeNO(int n ,int counter){
        for (int i = 1 ; i <= n ; i++){
            if (n%i==0){
                counter++;
            }

        }
        if (counter==2){
            System.out.println("prime number");
        }
        else {
            System.out.println("not a prime ");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        CheckPrimeNO(n , counter);

    }
}
