import java.util.HashSet;

public class uninon_of_2array {
    public static int union(int []array1 , int []array2){
        HashSet<Integer>set = new HashSet<>();
        for (int i =0 ; i < array1.length;i++){
            set.add(array1[i]);
        }
        for (int j = 0 ; j < array2.length;j++){
            set.add(array2[j]);
        }
        return set.size();

    }
    public static void main(String[]args){
        int []array1 = {7,6,3,4,2};
        int []array2 ={8,2,6,4,1};
        System.out.println(union(array1,array2));
    }
}

