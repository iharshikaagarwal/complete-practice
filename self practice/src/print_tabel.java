import java.util.*;
public class print_tabel {
    public static void PrintTabel(int n){
        for ( int i = 1 ; i <=10; i++ ){
            int tabel = n*i;
            System.out.println(n+"*"+i+"="+tabel);
        }
    }
    public static void main(String[]args){
        System.out.println("eneter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintTabel(n);
    }
}
