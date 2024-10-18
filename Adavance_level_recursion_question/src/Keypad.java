import java .util.HashSet;
public class Keypad {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void  printcombination(String str , int indx , String combination){
        if (indx==str.length()){
            System.out.println(combination);
            return ;
        }
        char currentchar = str.charAt(indx);
        String maping = keypad[currentchar-'0'];
        for (int i = 0 ; i < maping.length() ; i ++){
            printcombination(str,indx+1 , combination+maping.charAt(i));
        }

    }
    public static void main (String []args){
        String str= "23";
        printcombination(str , 0  , "");
    }
}
