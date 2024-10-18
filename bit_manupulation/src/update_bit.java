import java.util.Scanner;

public class update_bit {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        System.out.println("enter operation");
        int opr = sc.nextInt();
        System.out.println("enter position");
        int pos = sc.nextInt();
        int bitmask = 1<< pos;
        if(opr==1) {
            int newnumber = bitmask | n ;
            System.out.println(newnumber);
        }else{
            int newbitmass = ~(bitmask);
            int newnumber = newbitmass& n;
            System.out.println(newnumber);
        }

    }

}
