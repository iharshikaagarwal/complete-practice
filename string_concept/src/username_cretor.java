import java.util.Scanner;

public class username_cretor {
    public static void main(String []args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter your email");
        String email= sc.next();
        String username ="";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i)=='@') {
                break;
            }else {
                username = username+ email.charAt(i);
            }

        }
        System.out.println("hence the user name crete from the email address");
        System.out.println(username);
    }
}
