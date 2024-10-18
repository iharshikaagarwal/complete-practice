import java.util.ArrayList;

public class Array_list {

    //all the operation of array list

        public static void main(String[] args)
        {
            ArrayList<Integer> list= new ArrayList<Integer>();
            list.add(9);
            list.add(5);
            list.add(7);
            list.add(3);

            System.out.println(list);
            System.out.println(list.get(2));
            list.add(2,8);
            System.out.println(list);
            list.set(3,4);
            System.out.println(list);
            list.remove(2);
            System.out.println(list);
            System.out.println(list.size());

        }

}
