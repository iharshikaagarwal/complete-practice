import java.util.HashSet;

//important
public class subseq2 {
//    it is also a same question as a sub sequence of string but it is an complete code
//    because that code does not accept the strings like "aaaa" so write this code will hwlp for both
    public static void SUBSEQ(int i , String str ,String newstr,HashSet<String> set){
        if (i == str.length()){
            if (set.contains(newstr)){
                return;
            }else {
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }
        char currentchar = str.charAt(i);
        SUBSEQ(i+1 , str ,newstr+currentchar,set);
        SUBSEQ(i+1 , str ,newstr,set);

    }
    public static void main(String []args){
        String str ="aaa";
        HashSet<String> set = new HashSet<>();
        SUBSEQ(0,str,"",set);

    }
}
