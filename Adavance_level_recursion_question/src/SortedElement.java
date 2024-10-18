//here we are cehcking the array is completly sorted or not
public class SortedElement {
    public static boolean Sorting(int[]arr,int i ){
        if(i == arr.length-1){
            return true;
        }
        if (arr[i]<=arr[i+1]){
             return Sorting(arr,(i+1));
        }else {
            return false;
        }

    }
    public static void main(String[]args){
        int []arr = {1,3,5 };
//        its will show false if the array are {1,5,5} || {1 ,9,1,7}||{1,3,2,4}
        System.out.println(Sorting(arr,0));

    }
}
