import java.util.HashMap;
import java.util.HashSet;

public class inersectionof_array {
    public static int intersection(int[]arr1 , int []arr2){
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0 ; i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length;j++){
            if (set.contains(arr2[j])){
                count++;
                set.remove(arr2[j]);
            }
        }
        return count;
    }
    public static void main(String[]args){
        int []arr1={5,6,9,2,47,5};
        int []arr2={8,6,9,};
        System.out.println(intersection(arr1,arr2));

    }
}
