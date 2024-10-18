//  print the number 5 to 1
public class Main {
    public static void Printnum (int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        Printnum(n-1);

    }
    public static void main(String[] args) {
        int n = 5 ;
        Printnum(n);

    }
}