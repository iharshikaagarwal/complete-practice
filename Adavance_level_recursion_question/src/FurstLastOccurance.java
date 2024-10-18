//Q3. Find the occurrence of the first and last occurrence of an element using recursion.
public class FurstLastOccurance {
    public static int first = 0;
    public static int last =0;
    public static void PrintFLOccurance(String str , int indx, char element){
        if (indx==str.length()){
            return;
        }
        char currentchar = str.charAt(indx);
        if (currentchar==element){
            if (first==0){
                first=indx;
            }else {
                last=indx;
            }
        }
        PrintFLOccurance(str,indx+1 , element);
    }
    public static void main(String[]args){
        String str = " abbacdefaah";
        PrintFLOccurance(str,0 , 'a');
        System.out.println(first);
        System.out.println(last);



    }
}
