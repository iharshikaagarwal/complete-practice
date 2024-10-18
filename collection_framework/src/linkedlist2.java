import java.util.LinkedList;

//linkedlist without sractch
public class linkedlist2 {
    public static void main(String[]args){
        LinkedList<String>lis =new LinkedList<String>();
        lis.addFirst("b");
        lis.addFirst("a");
        System.out.println(lis);
        lis.addLast("d");
        lis.add(2,"c");
        System.out.println(lis);
    }
}
