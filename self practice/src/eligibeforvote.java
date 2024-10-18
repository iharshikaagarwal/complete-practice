import java.util.Scanner;

public class eligibeforvote {
    public static String EligibelForVote(int age){
        if (age >= 18){
            return "you are eligibel";
        }else {
            return ("not eligibel");
        }

    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        String result = EligibelForVote(age);
        System.out.println(result);
    }

}
