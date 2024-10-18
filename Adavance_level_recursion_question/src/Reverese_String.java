public class Reverese_String {
    public static void StringReverse(int i ,String str){
        if (i==0){
            System.out.print(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        StringReverse(i-1, str);

    }
    public static void main(String []args){
        String str ="abcd";
        StringReverse(str.length()-1 ,str);
    }
}
