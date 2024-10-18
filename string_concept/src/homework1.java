import java.util.Scanner;

public class homework1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[]names=new String[size];
        for (int i = 0 ; i<size;i++){
            names[i]=sc.next();
        }
        int totallength = 0;
        for (int i = 0; i <size ; i++) {
            totallength=totallength + names[i].length();
        }
        System.out.println(totallength);
    }
}
