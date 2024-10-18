import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseInbuiltMethods {
    public static void main(String[]args){
        int originalarray[] = {2,6,3,4,8,4};
        int reversedarray[ ]= new int[originalarray.length];
        for (int i = 0 ; i < originalarray.length;i++){
            reversedarray[i]=originalarray[originalarray.length-i-1];
        }
        System.out.println(Arrays.toString(reversedarray));


    }
}
