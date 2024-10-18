public class RemoveDuplicate {
    public static boolean[] map =new boolean[26];
    public static void DuplcateRemoval(String str ,int i , String newstr){
        if(i ==str.length()-1 ){
            System.out.println(newstr);
            return;
        }
        char currentchar = str.charAt(i);
        if (map [currentchar-'a']==true ){
            DuplcateRemoval(str , i +1 , newstr);
        }else {
            newstr +=currentchar;
            map[currentchar-'a']=true;
            DuplcateRemoval(str , i +1 , newstr);
        }
    }
    public static void main(String[]arsgs){
        String str ="abddejsbaaan";
        DuplcateRemoval(str,0,"");

    }
}
