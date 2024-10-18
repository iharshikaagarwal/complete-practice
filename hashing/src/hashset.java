import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[]args){
        HashSet<Integer> set = new HashSet<>();
//        insert
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(5);

//        it will not print the duplicate it print only one time

//searching ---->>>>contains
        if (set.contains(6)){
            System.out.println("found");
        }
        if(!set.contains(8)){
            System.out.println("not found");
        }
//        delete
        set.remove(0);
        if (set.contains(1)) {
            System.out.println("contain 1");
        }else {
            System.out.println(" not contain 1");
        }
//        check a size
        System.out.println("the size of set  "+set.size());
        System.out.println(set);

//        ITERATOR(for this import iterator)
        Iterator it =  set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
