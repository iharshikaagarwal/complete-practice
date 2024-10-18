import java.util.*;

public class sum_oddnum {


        public static void AddUpOddNum(int n ){
            int sum =0;
            for (int i = 1 ; i <= n; i+=2){
                sum= sum+i;

            }
            System.out.println("the sum of all odd number till "+ n + "is"+ sum);
        }
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number");
            int n = sc.nextInt();
            AddUpOddNum(n);
        }


}
