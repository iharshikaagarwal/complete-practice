public class SubSequences {
    public static void SUBSEQ(int i , String str ,String newstr){
        if (i == str.length()){
            System.out.println(newstr);
            return;
        }
        char currentchar = str.charAt(i);
        SUBSEQ(i+1 , str ,newstr+currentchar);
        SUBSEQ(i+1 , str ,newstr);

    }
    public static void main(String []args){
        String str ="abc";
        SUBSEQ(0,str,"");

    }
}
