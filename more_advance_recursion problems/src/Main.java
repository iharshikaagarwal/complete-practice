
//print all permutation of the string means all teh combination of the string
//abc ... abc,acb , bac.bca.cab,cba
public class Main {
    public static void CominationOfString(String str , String  combinations ){
        if (str.length()==0){
            System.out.println(combinations);
            return;
        }
        for (int i = 0 ; i < str.length();i++){
            char currentchar = str.charAt(i);
            String newstr = str.substring(0  ,i ) + str .substring(i+1);
            CominationOfString(newstr,combinations+currentchar);
        }
    }
    public static void main(String[] args) {
        String str  = "abc";
        CominationOfString(str , "");
    }

}