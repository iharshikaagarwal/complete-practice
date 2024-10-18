import java.util.Scanner;

public class homework2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String orignal = sc.next();
        String result = "";
        for (int i = 0; i < orignal.length(); i++) {
            if(orignal.charAt(i)== 'e'){
                result=result + 'i';
            }else {
                result=result+orignal.charAt(i);
            }
        }
        System.out.println(result);
    }
}
