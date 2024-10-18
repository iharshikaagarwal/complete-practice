public class Backtracking {
    public static void printpermutation(String str ,String per , int index){
        if(str.length()==0){
            System.out.println(per);
            return;
        }
        for (int i = 0 ; i<str.length() ; i++){
            char currentchar =str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            printpermutation(newstr,per+currentchar , index+1);
        }
    }
    public static void main(String[]args){
        String str = "ABC";
        printpermutation(str,"",0);
    }
}
