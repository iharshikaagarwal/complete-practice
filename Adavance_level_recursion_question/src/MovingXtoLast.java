public class MovingXtoLast {
    public static void MovigAllXAtLast(String str ,int i,int count , String newstr){

        if ( i==str.length()-1){
            for (int j = 0 ; j<count ;j++){
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }
        char currentchar =str.charAt(i);
        if (currentchar=='x'){
            count++;
            MovigAllXAtLast(str,i+1,count,newstr);
        }else {
            newstr+=currentchar;
            MovigAllXAtLast(str,i+1 , count, newstr);
        }


    }
    public static void main(String[]args){
        String str = "abcxgfjdxxffx";
        MovigAllXAtLast(str,0, 0, "");

    }
}
